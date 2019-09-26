package com.bignerdranch.android.demo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.bignerdranch.android.demo.ViewModel.DailyScheduleResponseViewModel
import com.bignerdranch.android.demo.databinding.FragmentDailyScheduleBinding

class ScheduleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentDailyScheduleBinding.inflate(inflater, container, false)
        val viewModel : DailyScheduleResponseViewModel by viewModels()
        binding.viewmodel = viewModel
        binding.lifecycleOwner = this

        println("asdfasdff --->> ${viewModel.dailySchedule}")

        return binding.root
    }
}