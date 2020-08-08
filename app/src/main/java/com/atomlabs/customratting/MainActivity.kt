package com.atomlabs.customratting

import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val ratingBar = findViewById<RatingBar>(R.id.customRating)

        if (ratingBar != null) {
            val button = findViewById<Button>(R.id.button)
            button?.setOnClickListener {
                val msg = ratingBar.rating.toString()
                Toast.makeText(
                    this@MainActivity,
                    "Rating is: " + msg, Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}