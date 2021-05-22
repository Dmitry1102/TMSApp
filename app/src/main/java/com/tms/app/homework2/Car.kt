package com.tms.app.homework2

class Car (
    brand: String,
    col: String,
    consumption: Float,
    num: String?

){
    private var brand: String = brand
    private var col: String = col
    private var consumption: Float = consumption
    private var num: String? = num



    fun infoCar(): String {
        return "Car brand: $brand ,  color: $col , consumption: $consumption , number: ${num ?: "Transit"}"
    }

}