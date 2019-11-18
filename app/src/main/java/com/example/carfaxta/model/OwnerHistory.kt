package com.example.carfaxta.model


import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable
import androidx.room.Entity

@Parcelize
data class OwnerHistory(
    @Json(name = "history")
    val history: List<History?>?,
    @Json(name = "icon")
    val icon: String?,
    @Json(name = "iconUrl")
    val iconUrl: String?,
    @Json(name = "text")
    val text: String?
) : Parcelable