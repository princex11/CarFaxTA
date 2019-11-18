package com.example.carfaxta.model


import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity


@Parcelize
data class FirstPhoto(
    @Json(name = "large")
    val large: String?,
    @Json(name = "medium")
    val medium: String?,
    @Json(name = "small")
    val small: String?
) : Parcelable