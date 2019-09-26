package com.bignerdranch.android.demo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bignerdranch.android.demo.databinding.FragmentDailyScheduleBinding

class ScheduleFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentDailyScheduleBinding.inflate(inflater, container, false)
        return binding.root
    }
}