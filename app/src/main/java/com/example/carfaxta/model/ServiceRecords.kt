package com.example.carfaxta.model
import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable


@Parcelize
data class ServiceRecords(
    @Json(name = "facets")
    val facets: List<Facet?>?
) : Parcelable