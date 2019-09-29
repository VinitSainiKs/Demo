package com.bignerdranch.android.demo.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.bignerdranch.android.demo.data.AppDatabase
import com.bignerdranch.android.demo.data.FacultyRepository

class DailyScheduleResponseViewModel(application: Application) : AndroidViewModel(application) {

    private val facultyDao = AppDatabase.getDatabase(application).facultyDao()
    val facultyRepository = FacultyRepository(facultyDao, viewModelScope)
    var dailySchedule =
        facultyRepository.getDailySchedule("2f572c68-6d50-e911-a95c-000d3af2cb54", "K12_PRO_002")

}