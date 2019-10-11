package com.bignerdranch.android.demo.responseModel


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "student_dashboard")
data class DashboardValueModel(

    @SerializedName("new_absentdays")
    @ColumnInfo(name = "new_absentdays")
    val newAbsentdays: Int = 0,

    @SerializedName("new_completedassignments")
    @ColumnInfo(name = "new_completedassignments")
    val newCompletedassignments: Int = 0,

    @SerializedName("new_obtainedmarks")
    @ColumnInfo(name = "new_obtainedmarks")
    val newObtainedmarks: Int = 0,

    @ColumnInfo(name = "new_percentage")
    @SerializedName("new_percentage")
    val newPercentage: Double = 0.0,

    @ColumnInfo(name = "new_presentdays")
    @SerializedName("new_presentdays")
    val newPresentdays: Int = 0,

    @ColumnInfo(name = "new_studyprogress")
    @SerializedName("new_studyprogress")
    val newStudyprogress: Double = 0.0,

    @ColumnInfo(name = "new_totalassignments")
    @SerializedName("new_totalassignments")
    val newTotalassignments: Int = 0,

    @ColumnInfo(name = "new_totalclasses")
    @SerializedName("new_totalclasses")
    val newTotalclasses: Int = 0,

    @ColumnInfo(name = "new_totalmarks")
    @SerializedName("new_totalmarks")
    val newTotalmarks: Int = 0,

    @ColumnInfo(name = "new_totalsubjects")
    @SerializedName("new_totalsubjects")
    val newTotalsubjects: Int = 0,

    @ColumnInfo(name = "sis_name")
    @SerializedName("sis_name")
    val sisName: String = "sis_name",

    @PrimaryKey @ColumnInfo(name = "serial_number")
    val serialNumber: Int = 1

)