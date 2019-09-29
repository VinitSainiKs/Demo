package com.bignerdranch.android.demo.responseModel


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "faculty_daily_schedule")
data class DailyScheduleResponseModel(

    @ColumnInfo(name = "class_name")
    val className: String,

    @ColumnInfo(name = "class_session_id")
    val classSessionID: String,

    @ColumnInfo(name = "end_date")
    val endDate: String,

    @ColumnInfo(name = "end_time")
    val end_time: String,

    @ColumnInfo(name = "section")
    val section: String,

    @ColumnInfo(name = "section_id")
    val sectionID: String,

    @ColumnInfo(name = "start_date")
    val startDate: String,

    @ColumnInfo(name = "start_time")
    val start_time: String,

    @ColumnInfo(name = "subject")
    val subject: String,

    @PrimaryKey
    @ColumnInfo(name = "subject_id")
    val subjectID: String
)