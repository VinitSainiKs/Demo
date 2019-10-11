package com.bignerdranch.android.demo.responseModel


import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity(tableName = "student_list")
data class StudentListResponseModel(
    @SerializedName("ContactID")
    val contactID: String,
    @SerializedName("ContactName")
    val contactName: String,
    @SerializedName("Currentclasssession")
    val currentclasssession: String,
    @SerializedName("Currentclasssessionid")
    val currentclasssessionid: String,
    @SerializedName("Entityimage")
    val entityimage: String,
    @SerializedName("Gender")
    val gender: Int,
    @SerializedName("Name")
    val name: String,
    @SerializedName("ParentDetails")
    val parentDetails: List<Any>,
    @SerializedName("RegistrationID")
    val registrationID: String,
    @SerializedName("RegistrationName")
    val registrationName: String,
    @SerializedName("StudentID")
    val studentID: String
)