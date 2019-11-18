package com.example.carfaxta.ui.fragments

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
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.carfaxta.R
import com.example.carfaxta.databinding.DetailFragmentBinding


import java.lang.Exception

class DetailFragment : Fragment() {


    companion object {
        fun newInstance() = DetailFragment()
    }

    private val viewModel: SharedViewModel by lazy { ViewModelProviders.of(this).get(SharedViewModel::class.java) }
    private lateinit var binding: DetailFragmentBinding
    private val args : DetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.detail_fragment,container,false)
        (activity as AppCompatActivity).supportActionBar?.hide()
        binding.sharedViewModel = viewModel
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel.carFaxModel.observe(this, Observer {
            val carListing = it?.listings?.get(args.position)
            binding.carListing = carListing
            binding.executePendingBindings()
        })

    }
}
