package com.example.rebellionassistant.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rebellionassistant.data.System
import com.example.rebellionassistant.data.SystemRepository
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class SystemViewModel(private val repository: SystemRepository) : ViewModel() {

    val systemUiState: StateFlow<SystemUiState> =
        repository.allSystems
            .map { SystemUiState(it) }
            .stateIn(
                scope = viewModelScope,
                started = SharingStarted.WhileSubscribed(5000),
                initialValue = SystemUiState()
            )

    fun addSystem(system: System) {
        viewModelScope.launch {
            repository.insert(system)
        }
    }

    fun updateSystem(system: System) {
        viewModelScope.launch {
            repository.update(system)
        }
    }

    fun deleteSystem(system: System) {
        viewModelScope.launch {
            repository.delete(system)
        }
    }
}

data class SystemUiState(val systemList: List<System> = listOf())
