package com.example.carfaxta.model


import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable
import androidx.room.*

@Parcelize
data class Listings(
    @Json(name = "accidentHistory")
    val accidentHistory: AccidentHistory?,

    @Json(name = "advantage")
    val advantage: Boolean?,

    @Json(name = "backfill")
    val backfill: Boolean?,

    @Json(name = "badge")
    val badge: String?,

    @Json(name = "bedLength")
    val bedLength: String?,

    @Json(name = "bodytype")
    val bodytype: String?,

    @Json(name = "cabType")
    val cabType: String?,

    @Json(name = "certified")
    val certified: Boolean?,

    @Json(name = "currentPrice")
    val currentPrice: Int?,

    @Json(name = "dealer")
    val dealer: Dealer?,

    @Json(name = "dealerType")
    val dealerType: String?,

    @Json(name = "displacement")
    val displacement: String?,

    @Json(name = "distanceToDealer")
    val distanceToDealer: Double?,

    @Json(name = "drivetype")
    val drivetype: String?,

    @Json(name = "engine")
    val engine: String?,

    @Json(name = "exteriorColor")
    val exteriorColor: String?,

    @Json(name = "firstSeen")
    val firstSeen: String?,

    @Json(name = "followCount")
    val followCount: Int?,

    @Json(name = "following")
    val following: Boolean?,

    @Json(name = "fuel")
    val fuel: String?,

    @Json(name = "hasViewed")
    val hasViewed: Boolean?,

    @Json(name = "id")
    val id: String?,

    @Json(name = "imageCount")
    val imageCount: Int?,

    @Json(name = "images")
    val images: Images?,

    @Json(name = "interiorColor")
    val interiorColor: String?,

    @Json(name = "isEnriched")
    val isEnriched: Boolean?,

    @Json(name = "listPrice")
    val listPrice: Int?,

    @Json(name = "listingStatus")
    val listingStatus: String?,

    @Json(name = "make")
    val make: String?,

    @Json(name = "mileage")
    val mileage: Int?,

    @Json(name = "model")
    val model: String?,

    @Json(name = "monthlyPaymentEstimate")
    val monthlyPaymentEstimate: MonthlyPaymentEstimate?,

    @Json(name = "mpgCity")
    val mpgCity: Int?,

    @Json(name = "mpgHighway")
    val mpgHighway: Int?,

    @Json(name = "noAccidents")
    val noAccidents: Boolean?,

    @Json(name = "oneOwner")
    val oneOwner: Boolean?,

    @Json(name = "onePrice")
    val onePrice: Int?,

    @Json(name = "onePriceArrows")
    val onePriceArrows: List<OnePriceArrow?>?,

    @Json(name = "onlineOnly")
    val onlineOnly: Boolean?,

    @Json(name = "ownerHistory")
    val ownerHistory: OwnerHistory?,

    @Json(name = "personalUse")
    val personalUse: Boolean?,

    @Json(name = "recordType")
    val recordType: String?,

    @Json(name = "sentLead")
    val sentLead: Boolean?,

    @Json(name = "serviceHistory")
    val serviceHistory: ServiceHistory?,

    @Json(name = "serviceRecords")
    val serviceRecords: Boolean?,

    @Json(name = "sortScore")
    val sortScore: Double?,

    @Json(name = "stockNumber")
    val stockNumber: String?,

    @Json(name = "subTrim")
    val subTrim: String?,

    @Json(name = "topOptions")
    val topOptions: List<String?>?,

    @Json(name = "transmission")
    val transmission: String?,

    @Json(name = "trim")
    val trim: String?,

    @Json(name = "vdpUrl")
    val vdpUrl: String?,

    @Json(name = "vehicleCondition")
    val vehicleCondition: String?,

    @Json(name = "vehicleUseHistory")
    val vehicleUseHistory: VehicleUseHistory?,

    @Json(name = "vin")
    val vin: String?,

    @Json(name = "year")
    val year: Int?

) : Parcelable