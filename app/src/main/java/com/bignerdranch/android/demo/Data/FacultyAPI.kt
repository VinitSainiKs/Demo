package com.bignerdranch.android.demo.Data

import com.bignerdranch.android.demo.ResponseModel.DailyScheduleResponseModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface FacultyAPI {
    @GET("DailySchedule/{contact_id}/{school_id}")
    fun getDalySchedule(@Path("contact_id") contactId: String, @Path("school_id") schoolId: String) : Call<List<DailyScheduleResponseModel>>
}