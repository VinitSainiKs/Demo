package com.bignerdranch.android.demo.data

import com.bignerdranch.android.demo.responseModel.DailyScheduleResponseModel
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface FacultyAPI {
    @GET("DailySchedule/{contact_id}/{school_id}")
    suspend fun getDalySchedule(@Path("contact_id") contactId: String, @Path("school_id") schoolId: String) : Response<List<DailyScheduleResponseModel>>
}