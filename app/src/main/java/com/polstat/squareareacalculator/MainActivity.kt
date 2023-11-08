package com.polstat.squareareacalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var lengthTextview: EditText
    private lateinit var areaTextview: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lengthTextview = findViewById(R.id.lengthTextview)
        areaTextview = findViewById(R.id.areaTextview)
    }

    fun calculate(view: View) {
        val len = lengthTextview.text.toString().toLong()
        areaTextview.text = "Luas: ${len * len}"
    }
}