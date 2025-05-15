package com.example.rebellionassistant.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "systems")
data class System(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val loyalty: String,
    val subjugation: Boolean,
    val base: String,
    val loyaltyChanged: Boolean
)
