package com.tms.app.homework3

open abstract class Animal(var speed: Double){

    companion object{
        private const val DISTANCE: Int = 1080
        private const val HOUR_TO_SEC = 3600

        fun countTime(speed:Double): Double = DISTANCE/ speed / HOUR_TO_SEC
    }

}