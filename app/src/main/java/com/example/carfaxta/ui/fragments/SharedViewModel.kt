package com.example.carfaxta.ui.fragments

import android.Manifest
import android.app.Application
import android.content.Context
import android.content.ContextWrapper
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.provider.SyncStateContract
import android.util.Log
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityCompat.requestPermissions
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.carfaxta.model.CarFaxModel
import com.example.carfaxta.network.retrofitClient
import kotlinx.coroutines.*
import retrofit2.Retrofit
import java.lang.Exception

class SharedViewModel : ViewModel() {

    private val viewModelJob = Job()
    private val coroutineScope = CoroutineScope(viewModelJob+Dispatchers.IO)
    val _carFaxModel = MutableLiveData<CarFaxModel?>()
    val carFaxModel:LiveData<CarFaxModel?>
    get() = _carFaxModel

    init {
        getCars()
    }

    fun getCars():LiveData<CarFaxModel?>{
        coroutineScope.launch {
            withContext(Dispatchers.Main){
                val getCarsDeferred = retrofitClient.retrofitService.getCars()
                try {
                    _carFaxModel.value = getCarsDeferred.await()
                }catch (e: Exception){
                    Log.d("exception", "${e.message}")
                }
            }
        }
        return _carFaxModel
    }
    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}
