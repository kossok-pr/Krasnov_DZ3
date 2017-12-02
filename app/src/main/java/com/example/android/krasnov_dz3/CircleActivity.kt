package com.example.android.krasnov_dz3

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.android.modal.Circle

class CircleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circle)

        var radiusText: EditText = findViewById(R.id.radius_text)
        var areaText: TextView = findViewById(R.id.area_text)
        var perimeterText: TextView = findViewById(R.id.perimeter_text)

        var countBtn: Button = findViewById(R.id.count_btn)
        countBtn.setOnClickListener {
            var sRadius: String = radiusText.text.toString()
            if (!sRadius.isEmpty()) {
                var radius = sRadius.toDouble()
                var circle = Circle(radius)
                areaText.text = String.format("Area: " + "%.2f", circle.countArea())
                perimeterText.text = String.format("Perimeter: " + "%.2f", circle.countPerimeter())
            } else Toast.makeText(applicationContext, "Fill the form", Toast.LENGTH_SHORT).show()
        }
    }
}
