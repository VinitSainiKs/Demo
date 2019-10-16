package com.bignerdranch.android.demo.responseModel

import com.google.gson.annotations.SerializedName

data class LoginResponseModel(

    @SerializedName("@odata.count")
    val odatacount: Int,

    @SerializedName("value")
    val value: List<LoginValueModel>
)