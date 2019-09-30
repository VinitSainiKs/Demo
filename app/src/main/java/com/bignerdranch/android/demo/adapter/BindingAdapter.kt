package com.bignerdranch.android.demo.adapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bignerdranch.android.demo.responseModel.DailyScheduleResponseModel

@BindingAdapter("app:dailyScheduleAdapter")
fun getDailySchedule(recyclerView: RecyclerView, dailyScheduleResponseModel: List<DailyScheduleResponseModel>?){
    dailyScheduleResponseModel?.let {
        recyclerView.adapter = DailyScheduleAdapter(dailyScheduleResponseModel)
    }
}