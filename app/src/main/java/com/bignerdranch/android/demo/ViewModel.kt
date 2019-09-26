package com.bignerdranch.android.demo

import androidx.lifecycle.ViewModel
import com.bignerdranch.android.demo.Data.FacultyRepository

class ViewModel : ViewModel() {
    val facultyRepository = FacultyRepository()

}