 package com.ahmetutlu.kotlinlandmarkbook

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_details_activitiy.*

class DetailsActivitiy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_activitiy)

        val intent= intent
        val landmarkName=intent.getStringExtra("name")
        textView.text=landmarkName

        val landmarkImageId= intent.getIntExtra("image",0)

        val selectedBitmap=BitmapFactory.decodeResource(applicationContext.resources,landmarkImageId)
        imageView.setImageBitmap(selectedBitmap)
    }
}