package com.bignerdranch.android.demo.responseModel

import androidx.room.ColumnInfo
import com.google.gson.annotations.SerializedName

data class sisRegistration(

    @SerializedName("_sis_school_value")
    @ColumnInfo(name = "_sis_school_value")
    val sisSchoolValue: String
)