package com.example.rebellionassistant.data

import kotlinx.coroutines.flow.Flow

class SystemRepository(private val systemDao: SystemDao) {
    val allSystems: Flow<List<System>> = systemDao.getAllSystems()

    suspend fun insert(system: System) {
        systemDao.insert(system)
    }

    suspend fun update(system: System) {
        systemDao.update(system)
    }

    suspend fun delete(system: System) {
        systemDao.delete(system)
    }

    suspend fun getSystemByName(name: String): System? {
        return systemDao.getSystemByName(name)
    }
}
