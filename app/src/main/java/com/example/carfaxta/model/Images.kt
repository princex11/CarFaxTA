package com.example.carfaxta.model

import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.TypeConverters


@Parcelize
data class Images(
    @Json(name = "baseUrl")
    val baseUrl: String?,
    @Embedded
    @Json(name = "firstPhoto")
    val firstPhoto: FirstPhoto?,
    @Json(name = "large")
    val large: List<String?>?,
    @Json(name = "medium")
    val medium: List<String?>?,
    @Json(name = "small")
    val small: List<String?>?
) : Parcelable