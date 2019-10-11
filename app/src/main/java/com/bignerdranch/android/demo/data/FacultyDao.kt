package com.bignerdranch.android.demo.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.bignerdranch.android.demo.responseModel.DailyScheduleResponseModel
import com.bignerdranch.android.demo.responseModel.DashboardResponseModel
import com.bignerdranch.android.demo.responseModel.DashboardValueModel
import com.bignerdranch.android.demo.responseModel.StudentListResponseModel

@Dao
interface FacultyDao {

    @Query("SELECT * FROM faculty_daily_schedule")
    fun getDailySchedule(): LiveData<List<DailyScheduleResponseModel>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFacultySchedule(facultyDailyScheduleResponseModels: List<DailyScheduleResponseModel>)

    @Query("SELECT * FROM student_dashboard")
    fun getDashboardData(): LiveData<DashboardValueModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDashboardData(model: DashboardValueModel)

    @Query("SELECT sis_studentid,_sis_currentclasssession_value FROM user_profile")
    fun getDashboardIds(): LiveData<DashboardIDModel?>

    @Query("SELECT * FROM student_list")
    fun getStudentInClass() : LiveData<List<StudentListResponseModel>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStudentList(studentListResponseModel: List<StudentListResponseModel>)
}