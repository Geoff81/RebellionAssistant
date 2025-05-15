package com.example.rebellionassistant.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.rebellionassistant.data.SystemRepository

class SystemViewModelFactory(
    private val repository: SystemRepository
) : ViewModelProvider.Factory {
    
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SystemViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return SystemViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
