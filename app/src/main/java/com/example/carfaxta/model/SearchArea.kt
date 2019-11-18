package com.example.carfaxta.model

import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable


@Parcelize
data class SearchArea(
    @Json(name = "city")
    val city: String?,
    @Json(name = "dynamicRadii")
    val dynamicRadii: List<Int?>?,
    @Json(name = "dynamicRadius")
    val dynamicRadius: Boolean?,
    @Json(name = "latitude")
    val latitude: Double?,
    @Json(name = "longitude")
    val longitude: Double?,
    @Json(name = "radius")
    val radius: Int?,
    @Json(name = "state")
    val state: String?,
    @Json(name = "zip")
    val zip: String?
) : Parcelable