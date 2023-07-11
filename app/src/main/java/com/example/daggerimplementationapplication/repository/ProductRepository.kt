package com.example.daggerimplementationapplication.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.daggerimplementationapplication.models.Product
import com.example.daggerimplementationapplication.retrofit.FakerAPI
import javax.inject.Inject


//repo required api object so for that used constructor injection
class ProductRepository @Inject  constructor(private val fakerAPI: FakerAPI){

    private val _products = MutableLiveData<List<Product>>()
    //live data read only data.
    val products :LiveData<List<Product>>
    get() = _products

    suspend fun getProducts(){
        //api call
        val result = fakerAPI.getProduct()
        if (result.isSuccessful && result.body() != null){
            //mutablelivedata set
            _products.postValue(result.body())
        }
    }
}