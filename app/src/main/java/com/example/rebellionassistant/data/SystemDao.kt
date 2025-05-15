package com.example.rebellionassistant.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface SystemDao {
    @Query("SELECT * FROM systems ORDER BY name ASC")
    fun getAllSystems(): Flow<List<System>>

    @Query("SELECT * FROM systems WHERE id = :id")
    suspend fun getSystemById(id: Int): System?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(system: System)

    @Update
    suspend fun update(system: System)

    @Delete
    suspend fun delete(system: System)

    @Query("DELETE FROM systems")
    suspend fun deleteAll()
}
