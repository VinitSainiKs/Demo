package com.bignerdranch.android.demo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bignerdranch.android.demo.databinding.CardDailyScheduleBinding
import com.bignerdranch.android.demo.responseModel.DailyScheduleResponseModel

class DailyScheduleAdapter(val list: List<DailyScheduleResponseModel>) : RecyclerView.Adapter<DailyScheduleAdapter.DailyScheduleHolder>() {
    lateinit var binding: CardDailyScheduleBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DailyScheduleHolder {
        binding = CardDailyScheduleBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        binding.list = list
        return DailyScheduleHolder(binding.root)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: DailyScheduleHolder, position: Int) {
        binding.position = position
    }


    class DailyScheduleHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}