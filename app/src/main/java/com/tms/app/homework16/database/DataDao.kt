package com.tms.app.homework16.database

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface DataDao {

    @Query("SELECT * FROM message_table")
    fun getInfo(): Flow<List<DataEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertData(data: DataEntity)

    @Delete
    fun deleteData(data: DataEntity)

}