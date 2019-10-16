package com.bignerdranch.android.demo.responseModel

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class LoginValueModel(

    @PrimaryKey
    @SerializedName("sis_loginmasterid")
    @ColumnInfo(name = "sis_loginmasterid")
    val sisLoginmasterid: String,

    @SerializedName("_sis_registration_value")
    @ColumnInfo(name = "_sis_registration_value")
    val sisRegistrationValue: String,

    @SerializedName("new_rolecode")
    val roleCode: Int,

    @SerializedName("sis_name")
    @ColumnInfo(name = "sis_name")
    val sisName: String,

    @Embedded
    @SerializedName("sis_registration")
    val sisRegistration: sisRegistration,

    @SerializedName("sis_user_id")
    @ColumnInfo(name = "sis_user_id")
    val sisUserId: String
)