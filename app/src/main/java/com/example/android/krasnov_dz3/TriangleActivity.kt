package com.example.android.krasnov_dz3

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.android.modal.Triangle

class TriangleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_triangle)

        var textA: EditText = findViewById(R.id.text_a)
        var textB: EditText = findViewById(R.id.text_b)
        var textC: EditText = findViewById(R.id.text_c)
        var textArea: TextView = findViewById(R.id.area_text)
        var textPerimeter: TextView = findViewById(R.id.perimeter_text)
        var countBtn: Button = findViewById(R.id.count_btn)
        countBtn.setOnClickListener {
            var a = textA.text.toString()
            var b = textB.text.toString()
            var c = textC.text.toString()
            if (!a.isEmpty() && !b.isEmpty() && !c.isEmpty()) {
                var dA = a.toDouble()
                var dB = b.toDouble()
                var dC = c.toDouble()
                if ((dA + dB) > dC || (dA + dC) > dB || (dB + dC) > dA) {
                    var triangle = Triangle(dA, dB, dC)
                    textArea.text = String.format("Area: " + "%.2f", triangle.countArea())
                    textPerimeter.text = String.format("Perimeter: " + "%.2f", triangle.countPerimeter())
                } else Toast.makeText(applicationContext, "Triangle cannot be built", Toast.LENGTH_SHORT).show()
            } else Toast.makeText(applicationContext, "Fill all the forms", Toast.LENGTH_SHORT).show()
        }
    }
}
