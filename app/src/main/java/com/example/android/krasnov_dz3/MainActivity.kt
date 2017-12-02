package com.example.android.krasnov_dz3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    lateinit var chosenString: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var shapeSpinner: Spinner = findViewById(R.id.shape_spinner)
        var arrayAdapter: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(applicationContext, R.array.shapes_array, android.R.layout.simple_spinner_item)
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        shapeSpinner.adapter = arrayAdapter
        shapeSpinner.onItemSelectedListener = this

        var chooseBtn: Button = findViewById(R.id.choose_btn)
        chooseBtn.setOnClickListener {
            lateinit var actIntent: Intent
            when (chosenString) {
                "Circle" -> actIntent = Intent(applicationContext, CircleActivity::class.java)
                "Rectangle" -> actIntent = Intent(applicationContext, RectangleActivity::class.java)
                "Triangle" -> actIntent = Intent(applicationContext, TriangleActivity::class.java)
            }
            actIntent.putExtra(Intent.EXTRA_TEXT, chosenString)
            startActivity(actIntent)
        }
    }


    override fun onNothingSelected(p0: AdapterView<*>?) {

    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        var selected: String = p0!!.getItemAtPosition(p2) as String
        when (selected) {
            "Circle" -> chosenString = "Circle"
            "Rectangle" -> chosenString = "Rectangle"
            "Triangle" -> chosenString = "Triangle"
        }
    }
}