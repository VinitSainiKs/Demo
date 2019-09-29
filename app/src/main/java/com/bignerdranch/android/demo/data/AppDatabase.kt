package com.bignerdranch.android.demo.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.bignerdranch.android.demo.responseModel.DailyScheduleResponseModel
import com.bignerdranch.android.demo.utilities.DatabaseConverters

@Database(entities = [DailyScheduleResponseModel::class], version = 1)
//@TypeConverters(DatabaseConverters::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun facultyDao(): FacultyDao

    companion object{
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            if (INSTANCE == null) {
                synchronized(AppDatabase::class.java) {
                    if (INSTANCE == null) {
                        INSTANCE = Room.databaseBuilder(
                            context.applicationContext,
                            AppDatabase::class.java,
                            "app_database"
                        ).build()
                    }
                }
            }
            return INSTANCE!!
        }
    }

}