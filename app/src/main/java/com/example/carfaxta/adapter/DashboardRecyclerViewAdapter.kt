package com.example.carfaxta.adapter

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.carfaxta.databinding.RowDashboardFragmentBinding
import com.example.carfaxta.model.CarFaxModel
import com.example.carfaxta.model.Listings
import com.example.carfaxta.ui.fragments.DashboardFragmentDirections


class DashboardRecyclerViewAdapter(val carFaxModel: CarFaxModel?) :
    RecyclerView.Adapter<DashboardRecyclerViewAdapter.DashboardViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DashboardViewHolder {
        return DashboardViewHolder.from(parent)
    }

    override fun getItemCount(): Int {
        return carFaxModel?.listings!!.size
    }

    override fun onBindViewHolder(holder: DashboardViewHolder, position: Int) {
        val carlisting = carFaxModel?.listings?.get(position)
        holder.bind(carlisting)
        holder.binding.cvDashboardFragment.setOnClickListener {
            val action =
                DashboardFragmentDirections.actionDashboardFragmentToDetailFragment(position)
            it.findNavController().navigate(action)
        }
    }

    class DashboardViewHolder private constructor(val binding: RowDashboardFragmentBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(carlisting: Listings?) {
            binding.carListing=carlisting
            binding.executePendingBindings()
        }
        companion object {
            fun from(parent: ViewGroup): DashboardViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = RowDashboardFragmentBinding.inflate(layoutInflater, parent, false)
                return DashboardViewHolder(binding)
            }
        }
    }
}