package com.example.rebellionassistant.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "systems")
data class System(
    @PrimaryKey val name: String,
    val loyalty: String = "",
    val subjugation: Boolean = false,
    val hasRebelBase: Boolean = false
)
