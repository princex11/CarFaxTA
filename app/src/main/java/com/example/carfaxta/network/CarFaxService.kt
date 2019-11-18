package com.example.carfaxta.network

import com.example.carfaxta.model.Listings
import com.example.carfaxta.model.CarFaxModel
import kotlinx.coroutines.Deferred
import retrofit2.http.GET

interface CarFaxService {
    @GET("assignment.json")
    fun getCars() : Deferred<CarFaxModel?>
}