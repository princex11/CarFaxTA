package com.example.carfaxta.model


import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable


@Parcelize
data class BreadCrumb(
    @Json(name = "label")
    val label: String?,
    @Json(name = "link")
    val link: String?,
    @Json(name = "position")
    val position: Int?
) : Parcelable