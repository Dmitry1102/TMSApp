package com.tms.app.homework2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tms.app.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SingletonOutput.returnCar()

    }
}