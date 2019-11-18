package com.example.carfaxta

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityCompat.*
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.carfaxta.adapter.DashboardRecyclerViewAdapter
import com.example.carfaxta.model.CarFaxModel
import com.example.carfaxta.model.Listings
import com.example.carfaxta.ui.fragments.DashboardFragment
import java.math.RoundingMode
import java.text.DecimalFormat
import kotlin.math.absoluteValue
import kotlin.math.roundToLong


@BindingAdapter("srcCompat")
    fun displayImage(imgView: ImageView, imgUrl:String?){
        Glide.with(imgView.context)
            .load(imgUrl)
            .placeholder(R.drawable.default_placeholder)
            .error(R.drawable.default_placeholder)
            .into(imgView)
    }

    @BindingAdapter("onClick")
    fun dialDealerNumber(callBtn: View, phone: String?){
        callBtn.setOnClickListener {
            if (it.context.checkSelfPermission(
                    Manifest.permission.CALL_PHONE)
                != PackageManager.PERMISSION_GRANTED) {
                if (shouldShowRequestPermissionRationale(it.context as Activity, Manifest.permission.CALL_PHONE)) {

                } else {
                    requestPermissions(it.context as Activity, arrayOf(Manifest.permission.CALL_PHONE),
                        Constants.PERMISSION_CALL_PHONE)
                }
            }else{
                if(phone!=null){
                    val context = it.context
                    val intent = Intent(Intent.ACTION_CALL).apply {
                        data = Uri.parse("tel:$phone")
                    }
                    if(intent.resolveActivity(context.packageManager)!=null){
                        context.startActivity(intent)
                    }else{
                        Toast.makeText(context, "No Phone Number Found", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }
        }
    }

@BindingAdapter("text")
fun roundMileage(txtView: TextView, mileage: Int?){
var floatMileage = mileage!!.toFloat()
    if(mileage>999.9){
        floatMileage = (floatMileage.div(1000))
        val df = DecimalFormat("#.#")
        df.roundingMode = RoundingMode.CEILING
        val mileageText = df.format(floatMileage).toString()+"k mi"
        txtView.text = mileageText
    }else
        if(mileage<1000){
            txtView.text = mileage.toString()
        }
}







