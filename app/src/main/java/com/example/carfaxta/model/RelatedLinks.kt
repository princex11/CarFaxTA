package com.example.carfaxta.model

import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable


@Parcelize
data class RelatedLinks(
    @Json(name = "Acura ILX Trim Levels")
    val acuraILXTrimLevels: List<AcuraILXTrimLevel?>?,
    @Json(name = "Similar Cars")
    val similarCars: List<SimilarCar?>?,
    @Json(name = "Used Acura ILX by Year")
    val usedAcuraILXByYear: List<UsedAcuraILXByYear?>?
) : Parcelable