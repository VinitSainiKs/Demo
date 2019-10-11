package com.bignerdranch.android.demo.responseModel


import com.google.gson.annotations.SerializedName

data class UserProfileResponseModel(
    @SerializedName("@odata.count")
    val odatacount: Int,
    @SerializedName("value")
    val value: List<UserProfileValueModel>
)