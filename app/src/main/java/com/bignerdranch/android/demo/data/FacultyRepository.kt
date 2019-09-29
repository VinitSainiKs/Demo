package com.bignerdranch.android.demo.data

import androidx.lifecycle.LiveData
import com.bignerdranch.android.demo.responseModel.DailyScheduleResponseModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.Exception
import java.util.concurrent.TimeUnit

class FacultyRepository(private val facultyDao: FacultyDao, private val currentScope: CoroutineScope){

    val client = OkHttpClient.Builder()
        .connectTimeout(10, TimeUnit.SECONDS)
        .readTimeout(10, TimeUnit.SECONDS)
        .writeTimeout(10,TimeUnit.SECONDS)
        .build()

    val facultyApi = Retrofit.Builder()
        .baseUrl("http://104.211.88.67:5147/SIS/")
        .client(client)
        .addConverterFactory(GsonConverterFactory.create())
        .build().create(FacultyAPI::class.java)

    fun getDailySchedule(contactId: String?, schoolId: String): LiveData<List<DailyScheduleResponseModel>>{
        currentScope.launch { getDailyScheduleFromNetwork(contactId, schoolId) }
        return facultyDao.getDailySchedule()
    }

    private suspend fun getDailyScheduleFromNetwork(contactId: String?, schoolId: String) {
        try {
            if (contactId != null){
                facultyApi.getDalySchedule(contactId, schoolId).body().let {
                    if (it!!.isNotEmpty()){
                        facultyDao.getDailySchedule()
                    }
                }
            }
        }catch (e: Exception){
            e.printStackTrace()
        }
    }


}