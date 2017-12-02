package com.example.android.modal

/**
 * Created by admin on 01.12.2017.
 */
class Rectangle(private var width: Double, private var height: Double): Figure {

    override var x: Double = 0.0
    override var y: Double = 0.0

    var x1: Double = 0.0
    var y1: Double = 0.0
    var x2: Double = 0.0
    var y2: Double = 0.0
    var x3: Double = 0.0
    var y3: Double = 0.0
    var x4: Double = 0.0
    var y4: Double = 0.0

    constructor(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double, y4: Double) : this(Math.abs(Math.sqrt(Math.pow((x2 - x1), 2.0) + Math.pow((y2 - y1), 2.0))), Math.abs(Math.sqrt(Math.pow((x4 - x1), 2.0) + Math.pow((y4 - y1), 2.0)))) {
        this.x1 = x1
        this.y1 = y1
        this.x2 = x2
        this.y2 = y2
        this.x3 = x3
        this.y3 = y3
        this.x4 = x4
        this.y4 = y4
    }

    override fun countArea(): Double {
        var area = width * height
        return area
    }

    override fun countPerimeter(): Double {
        var perimeter = (2 * width) + (2 * height)
        return perimeter
    }
}