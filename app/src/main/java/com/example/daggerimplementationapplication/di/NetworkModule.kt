package com.example.daggerimplementationapplication.di

import com.example.daggerimplementationapplication.retrofit.FakerAPI
import com.example.daggerimplementationapplication.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {
    @Singleton
    @Provides
    fun provideRetrofit() :Retrofit{
        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    @Singleton
    @Provides
    fun provideFakerAPI(retrofit: Retrofit) :FakerAPI{
       return  retrofit.create(FakerAPI::class.java)
    }
}