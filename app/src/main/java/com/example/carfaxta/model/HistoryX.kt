package com.example.carfaxta.model

import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable


@Parcelize
data class HistoryX(
    @Json(name = "city")
    val city: String?,
    @Json(name = "date")
    val date: String?,
    @Json(name = "description")
    val description: String?,
    @Json(name = "odometerReading")
    val odometerReading: Int?,
    @Json(name = "source")
    val source: String?,
    @Json(name = "state")
    val state: String?
) : Parcelable