package com.example.carfaxta.model


import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable


@Parcelize
data class Facet(
    @Json(name = "encodedName")
    val encodedName: String?,
    @Json(name = "name")
    val name: String?,
    @Json(name = "value")
    val value: Int?
) : Parcelable