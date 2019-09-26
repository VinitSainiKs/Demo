package com.bignerdranch.android.demo.ResponseModel


import com.google.gson.annotations.SerializedName

data class DailyScheduleResponseModel(
    @SerializedName("chapter")
    val chapter: Any,
    @SerializedName("className")
    val className: String,
    @SerializedName("classSessionID")
    val classSessionID: String,
    @SerializedName("end_date")
    val endDate: String,
    @SerializedName("end_time")
    val endTime: String,
    @SerializedName("Section")
    val section: String,
    @SerializedName("SectionID")
    val sectionID: String,
    @SerializedName("start_date")
    val startDate: String,
    @SerializedName("start_time")
    val startTime: String,
    @SerializedName("subject")
    val subject: String,
    @SerializedName("subjectID")
    val subjectID: String
)