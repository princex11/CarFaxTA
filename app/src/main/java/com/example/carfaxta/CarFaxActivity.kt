package com.example.carfaxta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast


class CarFaxActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.carfax_activity)
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        Toast.makeText(this, "Permission Granted", Toast.LENGTH_SHORT)
            .show()
    }
}

