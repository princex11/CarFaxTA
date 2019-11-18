package com.example.carfaxta.ui.fragments

import android.Manifest
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.carfaxta.R
import com.example.carfaxta.adapter.DashboardRecyclerViewAdapter
import com.example.carfaxta.databinding.DashboardFragmentBinding
import kotlinx.android.synthetic.main.dashboard_fragment.*
import java.lang.Exception

class DashboardFragment : Fragment() {

    companion object {
        fun newInstance() = DashboardFragment()
    }

    private val viewModel: SharedViewModel by lazy { ViewModelProviders.of(this).get(SharedViewModel::class.java) }

    private lateinit var binding: DashboardFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.dashboard_fragment, container, false)
        binding.lifecycleOwner = this
        binding.recyclerViewDashboardFragment.layoutManager = LinearLayoutManager(context)
        viewModel.getCars().observe(this, Observer {
            binding.recyclerViewDashboardFragment.adapter = DashboardRecyclerViewAdapter(it)
        })
        binding.executePendingBindings()
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        (activity as AppCompatActivity).supportActionBar?.show()
    }
}
