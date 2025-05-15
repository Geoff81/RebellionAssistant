package com.example.rebellionassistant.viewmodel

import androidx.lifecycle.*
import com.example.rebellionassistant.data.Repository
import com.example.rebellionassistant.model.SystemModel
import kotlinx.coroutines.launch

class SystemsViewModel(private val repository: Repository) : ViewModel() {

    private val _systems = MutableLiveData<List<SystemModel>>()
    val systems: LiveData<List<SystemModel>> = _systems

    init {
        fetchSystems()
    }

    private fun fetchSystems() {
        viewModelScope.launch {
            val list = repository.getAllSystems()
            _systems.postValue(list)
        }
    }

    fun addSystem(system: SystemModel) {
        viewModelScope.launch {
            repository.insertSystem(system)
            fetchSystems()
        }
    }

    fun deleteSystem(system: SystemModel) {
        viewModelScope.launch {
            repository.deleteSystem(system)
            fetchSystems()
        }
    }
}
