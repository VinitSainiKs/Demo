package com.bignerdranch.android.demo.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import com.bignerdranch.android.demo.viewModel.DailyScheduleResponseViewModel
import com.bignerdranch.android.demo.databinding.FragmentDailyScheduleBinding

class ScheduleFragment : Fragment() {

    val viewModel : DailyScheduleResponseViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentDailyScheduleBinding.inflate(inflater, container, false)
        binding.viewmodel = viewModel
        binding.lifecycleOwner = this

        viewModel.dailySchedule.observe(viewLifecycleOwner) {
            println("test --->> $it")
        }
        return binding.root
    }
}