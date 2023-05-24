package com.kimdev.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var gridView: GridView
    var nameList = ArrayList<String>()
    var imageList = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView = findViewById(R.id.gridView)

        fillArrays()

        val adapter = AnimalsAdapter(this, nameList, imageList)

        gridView.adapter = adapter

        gridView.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(this, "You clicked on ${nameList[position]}", Toast.LENGTH_SHORT).show()
        }
    }

    fun fillArrays() {
        nameList.add("Bird")
        nameList.add("Cat")
        nameList.add("Dog")
        nameList.add("Fish")
        nameList.add("Horse")
        nameList.add("Lion")
        nameList.add("Monkey")
        nameList.add("Tiger")
        nameList.add("Wolf")

        imageList.add(R.drawable.bird)
        imageList.add(R.drawable.cat)
        imageList.add(R.drawable.dog)
        imageList.add(R.drawable.fish)
        imageList.add(R.drawable.horse)
        imageList.add(R.drawable.lion)
        imageList.add(R.drawable.monkey)
        imageList.add(R.drawable.tiger)
        imageList.add(R.drawable.wolf)
    }
}