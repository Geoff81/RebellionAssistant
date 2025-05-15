package com.example.rebellionassistant.data

import com.example.rebellionassistant.model.SystemModel

class Repository(private val dao: SystemDao) {

    suspend fun getAllSystems(): List<SystemModel> {
        return dao.getAllSystems()
    }

    suspend fun insertSystem(system: SystemModel) {
        dao.insertSystem(system)
    }

    suspend fun deleteSystem(system: SystemModel) {
        dao.deleteSystem(system)
    }
}
