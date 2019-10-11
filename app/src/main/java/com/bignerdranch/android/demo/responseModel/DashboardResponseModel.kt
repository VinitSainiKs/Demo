package com.bignerdranch.android.demo.responseModel


import com.google.gson.annotations.SerializedName

data class DashboardResponseModel(
    @SerializedName("@odata.count")
    val odatacount: Int,
    @SerializedName("value")
    val value: List<DashboardValueModel>
)