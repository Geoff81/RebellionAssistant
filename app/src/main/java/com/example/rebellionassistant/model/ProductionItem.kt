package com.example.rebellionassistant.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "production_items")
data class ProductionItem(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val systemName: String,
    val unitName: String,
    val turn: Int
)
