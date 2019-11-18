package com.example.carfaxta.model

import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable


@Parcelize
data class SearchRequest(
    @Json(name = "make")
    val make: String?,
    @Json(name = "mileageRange")
    val mileageRange: MileageRangeX?,
    @Json(name = "model")
    val model: String?,
    @Json(name = "priceRange")
    val priceRange: PriceRange?,
    @Json(name = "radius")
    val radius: Int?,
    @Json(name = "srpUrl")
    val srpUrl: String?,
    @Json(name = "webHost")
    val webHost: String?,
    @Json(name = "yearRange")
    val yearRange: YearRangeX?,
    @Json(name = "zip")
    val zip: String?
) : Parcelable