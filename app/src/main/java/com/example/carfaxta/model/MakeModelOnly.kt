package com.example.carfaxta.model


import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable


@Parcelize
data class MakeModelOnly(
    @Json(name = "facets")
    val facets: List<Facet?>?
) : Parcelable