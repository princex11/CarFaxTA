package com.example.carfaxta.model


import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable


@Parcelize
data class OnePriceArrow(
    @Json(name = "arrow")
    val arrow: String?,
    @Json(name = "arrowUrl")
    val arrowUrl: String?,
    @Json(name = "icon")
    val icon: String?,
    @Json(name = "iconUrl")
    val iconUrl: String?,
    @Json(name = "order")
    val order: Int?,
    @Json(name = "text")
    val text: String?
) : Parcelable