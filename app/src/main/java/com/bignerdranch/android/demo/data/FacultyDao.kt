package com.bignerdranch.android.demo.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.bignerdranch.android.demo.responseModel.DailyScheduleResponseModel

@Dao
interface FacultyDao {

    @Query("SELECT * FROM faculty_daily_schedule")
    fun getDailySchedule(): LiveData<List<DailyScheduleResponseModel>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFacultySchedule(facultyDailyScheduleResponseModels: List<DailyScheduleResponseModel>)
}