package com.example.carfaxta.model

import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable


@Parcelize
data class ServiceHistory(
    @Json(name = "history")
    val history: List<HistoryX?>?,
    @Json(name = "icon")
    val icon: String?,
    @Json(name = "iconUrl")
    val iconUrl: String?,
    @Json(name = "number")
    val number: Int?,
    @Json(name = "text")
    val text: String?
) : Parcelable