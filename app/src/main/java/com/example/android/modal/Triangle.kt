package com.example.android.modal

/**
 * Created by admin on 01.12.2017.
 */
class Triangle(private var a: Double, private var b: Double, private var c: Double): Figure {

    override var x: Double = 0.0
    override var y: Double = 0.0

    override fun countArea(): Double {
        var hPer = (a + b + c) / 2
        var area = Math.sqrt(hPer * (hPer - a) * (hPer - b) * (hPer - c))
        return area
    }

    override fun countPerimeter(): Double {
        var perimeter = a + b + c
        return perimeter
    }
}