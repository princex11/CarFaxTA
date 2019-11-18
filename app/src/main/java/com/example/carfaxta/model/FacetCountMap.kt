package com.example.carfaxta.model


import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable


@Parcelize
data class FacetCountMap(
    @Json(name = "bedType")
    val bedType: BedType?,
    @Json(name = "bodyStyle")
    val bodyStyle: BodyStyle?,
    @Json(name = "cabType")
    val cabType: CabType?,
    @Json(name = "driveType")
    val driveType: DriveType?,
    @Json(name = "engines")
    val engines: Engines?,
    @Json(name = "exteriorColor")
    val exteriorColor: ExteriorColor?,
    @Json(name = "fuelType")
    val fuelType: FuelType?,
    @Json(name = "interiorColor")
    val interiorColor: InteriorColor?,
    @Json(name = "make")
    val make: Make?,
    @Json(name = "makeModelOnly")
    val makeModelOnly: MakeModelOnly?,
    @Json(name = "mileageRange")
    val mileageRange: MileageRange?,
    @Json(name = "model")
    val model: Model?,
    @Json(name = "noAccidents")
    val noAccidents: NoAccidents?,
    @Json(name = "oneOwner")
    val oneOwner: OneOwner?,
    @Json(name = "options")
    val options: Options?,
    @Json(name = "personalUse")
    val personalUse: PersonalUse?,
    @Json(name = "pillarCombos")
    val pillarCombos: PillarCombos?,
    @Json(name = "popularOptions")
    val popularOptions: PopularOptions?,
    @Json(name = "price")
    val price: Price?,
    @Json(name = "serviceRecords")
    val serviceRecords: ServiceRecords?,
    @Json(name = "transmission")
    val transmission: Transmission?,
    @Json(name = "trim")
    val trim: Trim?,
    @Json(name = "yearRange")
    val yearRange: YearRange?
) : Parcelable