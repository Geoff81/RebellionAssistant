package com.example.rebellionassistant.data

import android.content.Context

interface AppContainer {
    val systemRepository: SystemRepository
    val productionRepository: ProductionRepository
}

class AppDataContainer(private val context: Context) : AppContainer {
    override val systemRepository: SystemRepository by lazy {
        OfflineSystemRepository(RebellionDatabase.getDatabase(context).systemDao())
    }

    override val productionRepository: ProductionRepository by lazy {
        OfflineProductionRepository(RebellionDatabase.getDatabase(context).productionDao())
    }
}
