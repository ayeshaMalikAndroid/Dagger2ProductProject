package com.example.daggerimplementationapplication

import android.app.Application
import com.example.daggerimplementationapplication.di.ApplicationComponent
import com.example.daggerimplementationapplication.di.DaggerApplicationComponent

class FakerApplication :Application(){
lateinit var applicationCompontent : ApplicationComponent
    override fun onCreate() {
        super.onCreate()
        applicationCompontent = DaggerApplicationComponent.builder().build()
    }
}