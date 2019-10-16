package com.bignerdranch.android.demo.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.bignerdranch.android.demo.responseModel.DailyScheduleResponseModel
import com.bignerdranch.android.demo.responseModel.DashboardValueModel
import com.bignerdranch.android.demo.responseModel.LoginValueModel
import com.bignerdranch.android.demo.responseModel.StudentListResponseModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class FacultyRepository(private val facultyDao: FacultyDao, private val currentScope: CoroutineScope){

    val client = OkHttpClient.Builder()
        .connectTimeout(10, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .writeTimeout(30,TimeUnit.SECONDS)
        .build()

    val facultyApi = Retrofit.Builder()
        .baseUrl("http://104.211.88.67:5147/SIS/")
        .client(client)
        .addConverterFactory(GsonConverterFactory.create())
        .build().create(FacultyAPI::class.java)

    val loginApi = Retrofit.Builder()
        .baseUrl("http://104.211.88.67:5147/SIS_Student/")
        .client(client)
        .addConverterFactory(GsonConverterFactory.create())
        .build().create(FacultyAPI::class.java)



    suspend fun loginUser(userId: String, password: String, schoolId: String, loginData: MutableLiveData<LoginValueModel?>){
        try {
            loginApi.loginUser(userId, password, schoolId).body()?.value?.let {
                if (it.isNotEmpty()){
                    loginData.value = it[0]
                    facultyDao.insertLoginData(it[0])
                }else{
                    loginData.value = null
                }
            }
        }catch (e: java.lang.Exception){
            e.printStackTrace()
        }
    }

    fun getDailySchedule(contactId: String, schoolId: String): LiveData<List<DailyScheduleResponseModel>>{
        currentScope.launch { getDailyScheduleFromNetwork(contactId, schoolId) }
        return facultyDao.getDailySchedule()
    }

    private suspend fun getDailyScheduleFromNetwork(contactId: String, schoolId: String) {
        try {
                facultyApi.getDalySchedule(contactId, schoolId).body()?.let {
                    println("Data From DailyScheduleFromNetwork : $it")
                    if (it.isNotEmpty()){
                        facultyDao.insertFacultySchedule(it)
                    }
                }

        }catch (e: Exception){
            e.printStackTrace()
        }
    }


    fun getDashboardData(classSession: String, studentId: String, schoolId: String) : LiveData<DashboardValueModel>{
        currentScope.launch { getDashboardDataFromNetwork(classSession, studentId, schoolId) }
        return facultyDao.getDashboardData()
    }

    private suspend fun getDashboardDataFromNetwork(classSession: String, studentId: String, schoolId: String){
        try {
            facultyApi.getDashboardData(classSession, studentId, schoolId).body()?.value?.let {
                if (it.isNotEmpty()){
                    facultyDao.insertDashboardData(it[0])
                }
            }
        }catch (e: Exception){
            e.printStackTrace()
        }
    }


    fun getStudentInClass() :LiveData<List<StudentListResponseModel>>{
        currentScope.launch {  }
        return facultyDao.getStudentInClass()
    }

    private suspend fun getStudentsInClassFromNetwork(){
        try {
            facultyApi.getStudentInClass("7b61576b-083f-e911-a963-000d3af2ca7c", "K12_PRO_002").body()?.let {
                if (it.isNotEmpty()){
                    facultyDao.insertStudentList(it)
                }
            }
        }catch (e: Exception){
            e.printStackTrace()
        }
    }

}
