package com.example.daggerimplementationapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.daggerimplementationapplication.viewModels.MainViewModel
import com.example.daggerimplementationapplication.viewModels.MainViewModelFactory
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

   lateinit var mainViewModel: MainViewModel
   @Inject
   //field injection
   lateinit var mainViewModelFactory: MainViewModelFactory
   private val products :TextView
   get() = findViewById(R.id.products)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as FakerApplication).applicationCompontent.inject(this)
        mainViewModel = ViewModelProvider(this, mainViewModelFactory)[MainViewModel::class.java]


        mainViewModel.productLiveData.observe(this, Observer{
//convert list into string
      products.text  =  it.joinToString {  x-> x.title + "\n\n"

            }
        })
    }
}