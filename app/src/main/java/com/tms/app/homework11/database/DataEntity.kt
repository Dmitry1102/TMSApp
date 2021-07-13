package com.tms.app.homework11.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "message_table")
data class DataEntity(
    @PrimaryKey val id: Long,
    val message: String,
    val date: String
)