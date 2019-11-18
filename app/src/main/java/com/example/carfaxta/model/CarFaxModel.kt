package com.example.carfaxta.model


import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable
import androidx.room.*

@Parcelize
data class CarFaxModel(

    @Json(name = "backfillCount")
    val backfillCount: Int?,


    @Json(name = "breadCrumbs")
    val breadCrumbs: List<BreadCrumb?>?,

    @Json(name = "dealerNewCount")
    val dealerNewCount: Int?,

    @Json(name = "dealerUsedCount")
    @Ignore
    val dealerUsedCount: Int?,

    @Json(name = "enhancedCount")
    val enhancedCount: Int?,

    @Json(name = "facetCountMap")
    val facetCountMap: FacetCountMap?,

    @Json(name = "listings")
    val listings: List<Listings?>?,


    @Json(name = "page")
    val page: Int?,

    @Json(name = "pageSize")
    val pageSize: Int?,


    @Json(name = "relatedLinks")
    val relatedLinks: RelatedLinks?,

    @Json(name = "searchArea")
    val searchArea: SearchArea?,

    @Json(name = "searchRequest")
    val searchRequest: SearchRequest?,

    @Json(name = "seoUrl")
    val seoUrl: String?,

    @Json(name = "totalListingCount")
    val totalListingCount: Int?,

    @Json(name = "totalPageCount")
    val totalPageCount: Int?
) : Parcelable