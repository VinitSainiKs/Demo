package com.bignerdranch.android.demo.data

import com.bignerdranch.android.demo.responseModel.DailyScheduleResponseModel
import com.bignerdranch.android.demo.responseModel.DashboardResponseModel
import com.bignerdranch.android.demo.responseModel.StudentListResponseModel
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface FacultyAPI {
    @GET("DailySchedule/{contact_id}/{school_id}")
    suspend fun getDalySchedule(@Path("contact_id") contactId: String, @Path("school_id") schoolId: String) : Response<List<DailyScheduleResponseModel>>

    @GET("GetDashboardData/{class_session}/{student_id}/{school_id}")
    suspend fun getDashboardData(@Path("class_session") classSession: String, @Path("student_id") studentId: String, @Path("school_id") schoolId: String) : Response<DashboardResponseModel>

    @GET("Getstudentlistbyclasssession/{section_id}/{school_id}")
    suspend fun getStudentInClass(@Path("section_id")sectionId:String,@Path("school_id")schoolId:String) : Response<List<StudentListResponseModel>>
}