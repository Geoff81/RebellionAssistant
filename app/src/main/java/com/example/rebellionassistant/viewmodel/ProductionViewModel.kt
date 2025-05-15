package com.example.rebellionassistant.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rebellionassistant.data.Production
import com.example.rebellionassistant.data.ProductionRepository
import kotlinx.coroutines.launch

class ProductionViewModel(
    private val repository: ProductionRepository
) : ViewModel() {

    val allProductions: LiveData<List<Production>> = repository.allProductions

    fun insert(production: Production) = viewModelScope.launch {
        repository.insert(production)
    }

    fun delete(production: Production) = viewModelScope.launch {
        repository.delete(production)
    }
}
