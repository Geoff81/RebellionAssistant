package com.example.rebellionassistant.model

import androidx.room.Embedded
import androidx.room.Relation
import com.example.rebellionassistant.data.SystemEntity
import com.example.rebellionassistant.data.ProductionEntity

data class SystemWithProduction(
    @Embedded val system: SystemEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "systemId"
    )
    val production: List<ProductionEntity>
)
