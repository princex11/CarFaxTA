package com.example.carfaxta.model


import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.TypeConverters

@Parcelize
data class AccidentHistory(
    @Json(name = "accidentSummary")
    val accidentSummary: List<String?>?,
    @Json(name = "icon")
    val icon: String?,
    @Json(name = "iconUrl")
    val iconUrl: String?,
    @Json(name = "text")
    val text: String?
) : Parcelable