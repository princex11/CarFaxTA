package com.example.carfaxta.model


import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@Parcelize
data class AcuraILXTrimLevel(
    @Json(name = "count")
    val count: Int?,
    @Json(name = "text")
    val text: String?,
    @Json(name = "url")
    val url: String?
) : Parcelable