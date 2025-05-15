package com.example.rebellionassistant.data

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.rebellionassistant.ui.production.ProductionViewModel
import com.example.rebellionassistant.ui.systems.SystemsViewModel

object AppViewModelProvider {
    val Factory = ViewModelProvider.NewInstanceFactory()
}

class SystemsViewModelFactory(private val application: Application) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SystemsViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return SystemsViewModel(application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}

class ProductionViewModelFactory(private val application: Application) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ProductionViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return ProductionViewModel(application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
