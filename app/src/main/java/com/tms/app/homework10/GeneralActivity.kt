package com.tms.app.homework10

import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class GeneralActivity: AppCompatActivity() {


    companion object{
        const val TWIX = "Twix"
        const val SNICKERS = "Snickers"
        const val MARS = "Mars"

        fun buildCode(): Int {
            val code = Random.nextInt(10000000, 99999999)
            return code
        }


    }
}