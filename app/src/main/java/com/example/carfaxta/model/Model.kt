package com.example.carfaxta.model


import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.TypeConverters


@Parcelize
@Entity
data class Model(
    @Json(name = "facets")
    val facets: List<Facet?>?
) : Parcelable