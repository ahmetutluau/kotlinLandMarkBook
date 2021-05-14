package com.ahmetutlu.kotlinlandmarkbook

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      /*  //image
        val izmir = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.izmir)
        val istanbul = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.istanbul)
        val adana= BitmapFactory.decodeResource(applicationContext.resources,R.drawable.adana)
        val trabzon = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.trabzon)

        val landmarkImage=ArrayList<Bitmap>()
        landmarkImage.add(izmir)
        landmarkImage.add(istanbul)
        landmarkImage.add(adana)
        landmarkImage.add(trabzon)
*/

        // image - efficient
        val izmirId=R.drawable.izmir
        val istanbulId=R.drawable.istanbul
        val adanaId=R.drawable.adana
        val trabzonId=R.drawable.trabzon

        val landmarkImagesId=ArrayList<Int>()
        landmarkImagesId.add(izmirId)
        landmarkImagesId.add(istanbulId)
        landmarkImagesId.add(adanaId)
        landmarkImagesId.add(trabzonId)


        //Data
        val landmarkNames=ArrayList<String>()
        landmarkNames.add("İzmir")
        landmarkNames.add("İstanbul")
        landmarkNames.add("adana")
        landmarkNames.add("Trabzon")

        //Adapter: Layout && Data

        //val adapter= ArrayAdapter(this,R.layout.list_row,R.id.textView2,landmarkNames)
        val adapter= ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarkNames)

        listView.adapter=adapter

        listView.onItemClickListener=AdapterView.OnItemClickListener { parent, view, position, id ->
            val intent = Intent(applicationContext,DetailsActivitiy::class.java)

            intent.putExtra("name",landmarkNames[position])
            intent.putExtra("image",landmarkImagesId[position])

            startActivity(intent)
        }

    }
}