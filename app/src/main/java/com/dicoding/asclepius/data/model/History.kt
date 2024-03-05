package com.dicoding.asclepius.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class History (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val label: String,
    val confidence: String,
    val imagePath: String,
)
