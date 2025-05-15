package com.example.rebellionassistant

import android.app.Application
import com.example.rebellionassistant.data.AppDatabase
import com.example.rebellionassistant.data.ProductionRepository
import com.example.rebellionassistant.data.SystemRepository

class RebellionApplication : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val systemRepository by lazy { SystemRepository(database.systemDao()) }
    val productionRepository by lazy { ProductionRepository(database.productionDao()) }
}
