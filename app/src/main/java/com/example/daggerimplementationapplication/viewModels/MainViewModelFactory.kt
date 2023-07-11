package com.example.daggerimplementationapplication.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.daggerimplementationapplication.repository.ProductRepository
import javax.inject.Inject


//create object for viewModel
class MainViewModelFactory @Inject constructor(private val repository: ProductRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }


}