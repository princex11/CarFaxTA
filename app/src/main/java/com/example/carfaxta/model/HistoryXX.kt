package com.example.carfaxta.model

import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable


@Parcelize
data class HistoryXX(
    @Json(name = "averageMilesPerYear")
    val averageMilesPerYear: Int?,
    @Json(name = "ownerNumber")
    val ownerNumber: Int?,
    @Json(name = "useType")
    val useType: String?
) : Parcelable