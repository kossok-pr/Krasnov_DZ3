package com.example.android.modal

/**
 * Created by admin on 01.12.2017.
 */
class Rectangle(private var width: Double, private var height: Double): Figure {

    constructor(x1: Double, y1: Double, x2: Double, y2: Double, degree: Int) : this(x1, y1) {
        this.x1 = x1
        this.y1 = y1
        this.x2 = x2
        this.y2 = y2
        this.degree = degree
    }

    override var x: Double = 0.0
    override var y: Double = 0.0

    var x1: Double = 0.0
    var y1: Double = 0.0
    var x2: Double = 0.0
    var y2: Double = 0.0
    var degree: Int = 0

    override fun countArea(): Double {
        var area = width * height
        return area
    }

    fun countArea(x1: Double, y1: Double, x2: Double, y2: Double, degree: Double): Double {
        var diagonal = Math.abs(Math.sqrt(Math.pow((y2 - y1), 2.0) + Math.pow((x2 - x1), 2.0)))
        var area = (Math.pow(diagonal, 2.0) * Math.sin(Math.toRadians(degree))) / 2
        return area
    }

    override fun countPerimeter(): Double {
        var perimeter = (2 * width) + (2 * height)
        return perimeter
    }
}