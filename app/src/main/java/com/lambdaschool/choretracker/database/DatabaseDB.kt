package com.lambdaschool.choretracker.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.lambdaschool.choretracker.model.Child
import com.lambdaschool.choretracker.model.Chore

@Database(entities = [Chore::class, Child::class], version = 2, exportSchema = false)
abstract class database : RoomDatabase() {
    abstract fun databaseDao() : DatabaseDAO
}