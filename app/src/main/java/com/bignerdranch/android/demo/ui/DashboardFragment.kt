package com.bignerdranch.android.demo.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.map
import androidx.lifecycle.observe
import com.bignerdranch.android.demo.databinding.FragmentDashboardBinding
import com.bignerdranch.android.demo.viewModel.DashboardResponseViewModel

class DashboardFragment : Fragment(){

    lateinit var binding : FragmentDashboardBinding
    val viewmodel: DashboardResponseViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDashboardBinding.inflate(inflater, container, false)

        viewmodel.studentId.observe(viewLifecycleOwner){
            println("Student ID ----->> $it")
        }

        viewmodel.dashboardData.map {
            it?.let {
                (it.newPresentdays.toDouble() / (it.newPresentdays + it.newAbsentdays)) * 100
            }
        }.observe(this) {
            println(" --------------------->>>>> $it")
        }

        return binding.root
    }
}