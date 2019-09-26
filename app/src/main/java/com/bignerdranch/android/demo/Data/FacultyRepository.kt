package com.bignerdranch.android.demo.Data

import com.bignerdranch.android.demo.ResponseModel.DailyScheduleResponseModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class FacultyRepository {
    lateinit var dailyScheduleResponseModel: List<DailyScheduleResponseModel>

    val facultyApi = Retrofit.Builder()
        .baseUrl("http://104.211.88.67:5147/SIS/")
        .addConverterFactory(GsonConverterFactory.create())
        .build().create(FacultyAPI::class.java)

    fun getDailySchedule() : List<DailyScheduleResponseModel>{
        facultyApi
            .getDalySchedule("2f572c68-6d50-e911-a95c-000d3af2cb54", "K12_PRO_002")
            .enqueue(object : Callback<List<DailyScheduleResponseModel>>{
                override fun onFailure(call: Call<List<DailyScheduleResponseModel>>, t: Throwable) {
                    t.printStackTrace()
                }

                override fun onResponse(
                    call: Call<List<DailyScheduleResponseModel>>,
                    response: Response<List<DailyScheduleResponseModel>>
                ) {
                    dailyScheduleResponseModel = response.body() as List<DailyScheduleResponseModel>
                }

            })
        return dailyScheduleResponseModel
    }
}