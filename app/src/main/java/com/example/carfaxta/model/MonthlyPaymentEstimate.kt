package com.example.carfaxta.model


import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable
import androidx.room.Entity

@Parcelize
data class MonthlyPaymentEstimate(
    @Json(name = "downPaymentAmount")
    val downPaymentAmount: Double?,
    @Json(name = "downPaymentPercent")
    val downPaymentPercent: Int?,
    @Json(name = "interestRate")
    val interestRate: Int?,
    @Json(name = "loanAmount")
    val loanAmount: Double?,
    @Json(name = "monthlyPayment")
    val monthlyPayment: Double?,
    @Json(name = "price")
    val price: Int?,
    @Json(name = "termInMonths")
    val termInMonths: Int?
) : Parcelable