package com.example.android.modal

/**
 * Created by admin on 01.12.2017.
 */
class Circle(private var radius: Double): Figure {

    override var x: Double = 0.0
    override var y: Double = 0.0

    override fun countArea(): Double {
        var area = Math.PI * (radius * radius)
        return area
    }

    override fun countPerimeter(): Double {
        var perimeter = 2 * Math.PI * radius
        return perimeter
    }
}