package com.example.rebellionassistant.data

import androidx.room.*
import com.example.rebellionassistant.model.SystemModel

@Dao
interface SystemDao {

    @Query("SELECT * FROM systems")
    suspend fun getAllSystems(): List<SystemModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSystem(system: SystemModel)

    @Delete
    suspend fun deleteSystem(system: SystemModel)
}
