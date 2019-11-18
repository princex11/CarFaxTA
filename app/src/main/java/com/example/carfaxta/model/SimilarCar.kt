package com.example.carfaxta.model
import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable


@Parcelize
data class SimilarCar(
    @Json(name = "text")
    val text: String?,
    @Json(name = "url")
    val url: String?
) : Parcelable