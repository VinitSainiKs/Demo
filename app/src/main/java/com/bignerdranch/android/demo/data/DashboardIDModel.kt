package com.bignerdranch.android.demo.data

import androidx.room.ColumnInfo

data class DashboardIDModel(

    @ColumnInfo(name = "sis_studentid")
    val studentId: String,

    @ColumnInfo(name = "_sis_currentclasssession_value")
    val classId: String

)