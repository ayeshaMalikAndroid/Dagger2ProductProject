package com.example.daggerimplementationapplication.retrofit

import com.example.daggerimplementationapplication.models.Product
import retrofit2.Response
import retrofit2.http.GET

interface FakerAPI {

@GET("products")
suspend fun getProduct() :Response<List<Product>>
}