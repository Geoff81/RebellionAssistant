package com.example.rebellionassistant.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.rebellionassistant.model.Production
import com.example.rebellionassistant.model.Systeme

@Database(entities = [Systeme::class, Production::class], version = 1, exportSchema = false)
abstract class RebellionDatabase : RoomDatabase() {

    abstract fun systemDao(): SystemDao
    abstract fun productionDao(): ProductionDao

    companion object {
        @Volatile
        private var Instance: RebellionDatabase? = null

        fun getDatabase(context: Context): RebellionDatabase {
            return Instance ?: synchronized(this) {
                Room.databaseBuilder(
                    context.applicationContext,
                    RebellionDatabase::class.java,
                    "rebellion_database"
                ).build().also { Instance = it }
            }
        }
    }
}
