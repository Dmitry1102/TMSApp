package com.tms.app.homework3

open abstract class Animal(var speed: Double){
    fun countTime(): Double {
        return DISTANCE/speed/ HOUR_TO_SEC
    }

    companion object{
        private const val DISTANCE: Int = 1080
        private const val HOUR_TO_SEC = 3600



    }

}