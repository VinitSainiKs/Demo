package com.bignerdranch.android.demo.responseModel


import com.google.gson.annotations.SerializedName

data class SisSection(
    @SerializedName("sis_name")
    val sisName: String
)