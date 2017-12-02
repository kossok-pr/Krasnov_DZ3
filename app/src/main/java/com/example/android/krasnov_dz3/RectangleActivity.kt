package com.example.android.krasnov_dz3

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.android.modal.Rectangle

class RectangleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rectangle)

        var widthText: EditText = findViewById(R.id.width_text)
        var heightText: EditText = findViewById(R.id.height_text)
        var whAreaText: TextView = findViewById(R.id.wh_area_text)
        var whPerimeterText: TextView = findViewById(R.id.wh_perimeter_text)
        var whCountBtn: Button = findViewById(R.id.wh_count_btn)

        whCountBtn.setOnClickListener {
            var width = widthText.text.toString()
            var height = heightText.text.toString()
            if (!width.isEmpty() && !height.isEmpty()) {
                var dWidth = width.toDouble()
                var dHeight = height.toDouble()
                var rectangle = Rectangle(dWidth, dHeight)
                whAreaText.text = String.format("Area: " + "%.2f", rectangle.countArea())
                whPerimeterText.text = String.format("Perimeter: " + "%.2f", rectangle.countPerimeter())
            }
        }

        var x1Text: EditText = findViewById(R.id.x1_text)
        var y1Text: EditText = findViewById(R.id.y1_text)
        var x2Text: EditText = findViewById(R.id.x2_text)
        var y2Text: EditText = findViewById(R.id.y2_text)
        var x3Text: EditText = findViewById(R.id.x3_text)
        var y3Text: EditText = findViewById(R.id.y3_text)
        var x4Text: EditText = findViewById(R.id.x4_text)
        var y4Text: EditText = findViewById(R.id.y4_text)
        var cAreaText: TextView = findViewById(R.id.c_area_text)
        var cPerimeterText: TextView = findViewById(R.id.c_perimeter_text)
        var cCountBtn: Button = findViewById(R.id.c_count_btn)

        cCountBtn.setOnClickListener {
            var x1 = x1Text.text.toString()
            var y1 = y1Text.text.toString()
            var x2 = x2Text.text.toString()
            var y2 = y2Text.text.toString()
            var x3 = x3Text.text.toString()
            var y3 = y3Text.text.toString()
            var x4 = x4Text.text.toString()
            var y4 = y4Text.text.toString()
            if (!x1.isEmpty() && !y1.isEmpty() && !x2.isEmpty() && !y2.isEmpty() && !x3.isEmpty() && !y3.isEmpty() && !x4.isEmpty() && !y4.isEmpty()) {
                var dX1 = x1.toDouble()
                var dY1 = y1.toDouble()
                var dX2 = x2.toDouble()
                var dY2 = y2.toDouble()
                var dX3 = x3.toDouble()
                var dY3 = y3.toDouble()
                var dX4 = x4.toDouble()
                var dY4 = y4.toDouble()
                var diagonal1 = Math.abs(Math.sqrt(Math.pow((dX2 - dX1), 2.0) + Math.pow((dY2 - dY1), 2.0)))
                var diagonal2 = Math.abs(Math.sqrt(Math.pow((dX4 - dX3), 2.0) + Math.pow((dY4 - dY3), 2.0)))
                if (diagonal1 == diagonal2) {
                    var rectangle = Rectangle(dX1, dY1, dX2, dY2, dX3, dY3, dX4, dY4)
                    cAreaText.text = String.format("Area: " + "%.2f", rectangle.countArea())
                    cPerimeterText.text = String.format("Perimeter: " + "%.2f", rectangle.countPerimeter())
                } else Toast.makeText(applicationContext, "Cannot build a rectangle", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
