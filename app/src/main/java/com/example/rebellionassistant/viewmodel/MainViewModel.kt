package com.example.rebellionassistant.viewmodel

import androidx.lifecycle.*
import com.example.rebellionassistant.data.Repository
import com.example.rebellionassistant.model.SystemModel
import kotlinx.coroutines.launch

class MainViewModel(private val repository: Repository) : ViewModel() {

    private val _systems = MutableLiveData<List<SystemModel>>()
    val systems: LiveData<List<SystemModel>> = _systems

    init {
        loadSystems()
    }

    private fun loadSystems() {
        viewModelScope.launch {
            val list = repository.getAllSystems()
            _systems.postValue(list)
        }
    }

    fun refreshData() {
        loadSystems()
        // ajouter d'autres chargements si nécessaire
    }
}
