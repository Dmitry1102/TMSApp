package com.tms.app.homework11.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [DataEntity::class], version = 1)
abstract class DataBase: RoomDatabase() {

    abstract fun dataDao():DataDao
}