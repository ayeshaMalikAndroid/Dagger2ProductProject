package com.example.daggerimplementationapplication.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.daggerimplementationapplication.models.Product
import com.example.daggerimplementationapplication.repository.ProductRepository
import kotlinx.coroutines.launch

class MainViewModel(private val repository: ProductRepository):ViewModel() {


val productLiveData : LiveData<List<Product>>
get() = repository.products


init {
    //launch coroutine
    viewModelScope.launch {
        // call repo method
        repository.getProducts()
    }
}}