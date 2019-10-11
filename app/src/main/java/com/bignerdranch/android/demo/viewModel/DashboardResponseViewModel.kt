package com.bignerdranch.android.demo.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.Transformations
import androidx.lifecycle.viewModelScope
import com.bignerdranch.android.demo.data.AppDatabase
import com.bignerdranch.android.demo.data.FacultyRepository

class DashboardResponseViewModel(application: Application) : AndroidViewModel(application) {
    val facultyDao = AppDatabase.getDatabase(application, viewModelScope).facultyDao()
    val facultyRepository = FacultyRepository(facultyDao, viewModelScope)
    val studentId = facultyDao.getDashboardIds()

    val dashboardData = Transformations.switchMap(studentId) {
        it?.let {
            println("DashboardIDS $it")
            facultyRepository.getDashboardData(it.classId, it.studentId,"K12_PRO_002")
        }
    }
}