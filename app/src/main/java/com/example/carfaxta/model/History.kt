package com.example.carfaxta.model

import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable


@Parcelize
data class History(
    @Json(name = "city")
    val city: String?,
    @Json(name = "endOwnershipDate")
    val endOwnershipDate: String?,
    @Json(name = "ownerNumber")
    val ownerNumber: Int?,
    @Json(name = "purchaseDate")
    val purchaseDate: String?,
    @Json(name = "state")
    val state: String?
) : Parcelable