package com.example.carfaxta.model


import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey

@Parcelize
data class Dealer(
    @Json(name = "address")
    val address: String?,
    @Json(name = "carfaxId")
    val carfaxId: String?,
    @Json(name = "cfxMicrositeUrl")
    val cfxMicrositeUrl: String?,
    @Json(name = "city")
    val city: String?,
    @Json(name = "dealerAverageRating")
    val dealerAverageRating: Double?,
    @Json(name = "dealerInventoryUrl")
    val dealerInventoryUrl: String?,
    @Json(name = "dealerLeadType")
    val dealerLeadType: String?,
    @Json(name = "dealerReviewComments")
    val dealerReviewComments: String?,
    @Json(name = "dealerReviewCount")
    val dealerReviewCount: Int?,
    @Json(name = "dealerReviewDate")
    val dealerReviewDate: String?,
    @Json(name = "dealerReviewRating")
    val dealerReviewRating: Int?,
    @Json(name = "dealerReviewReviewer")
    val dealerReviewReviewer: String?,
    @Json(name = "dealerReviewTitle")
    val dealerReviewTitle: String?,
    @Json(name = "latitude")
    val latitude: String?,
    @Json(name = "longitude")
    val longitude: String?,
    @Json(name = "name")
    val name: String?,
    @Json(name = "onlineOnly")
    val onlineOnly: Boolean?,
    @Json(name = "phone")
    val phone: String?,
    @Json(name = "state")
    val state: String?,
    @Json(name = "zip")
    val zip: String?
) : Parcelable