package com.example.carfaxta.network

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

private const val BASE_URL = "https://carfax-for-consumers.firebaseio.com/"
private val interceptor = run {
    val loggingInterceptor = HttpLoggingInterceptor()
    loggingInterceptor.apply {
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
    }
}
private val client = OkHttpClient.Builder().addInterceptor(interceptor).build()
private val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .addCallAdapterFactory(CoroutineCallAdapterFactory())
    .baseUrl(BASE_URL)
    .client(client)
    .build()

object retrofitClient{
    val retrofitService: CarFaxService by lazy { retrofit.create(CarFaxService::class.java) }
}

