package com.bignerdranch.android.demo.ViewModel

import androidx.lifecycle.ViewModel
import com.bignerdranch.android.demo.Data.FacultyRepository
import com.bignerdranch.android.demo.ResponseModel.DailyScheduleResponseModel

class DailyScheduleResponseViewModel : ViewModel() {
    val facultyRepository = FacultyRepository()
    var dailySchedule : List<DailyScheduleResponseModel>

    init {
        dailySchedule = getDailySChedule()
    }

    private fun getDailySChedule() : List<DailyScheduleResponseModel>{
        return facultyRepository.getDailySchedule()
    }
}