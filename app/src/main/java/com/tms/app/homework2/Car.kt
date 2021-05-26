package com.tms.app.homework2

class Car (
    private var brand: String,
    private var col: String,
    private var consumption: Float,
    private var num: String?

){

    fun infoCar(): String {
        return "Car brand: $brand ,  color: $col , consumption: $consumption , number: ${num ?: "Transit"}"
    }

}