package com.example.sampahku.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.sampahku.database.dao.DatabaseDao
import com.example.sampahku.model.ModelDatabase


@Database(entities = [ModelDatabase::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun databaseDao(): DatabaseDao?
}