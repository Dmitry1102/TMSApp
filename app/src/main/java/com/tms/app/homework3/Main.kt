package com.tms.app.homework3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tms.app.R
import com.tms.app.homework2.Singleton

class Main: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var elephant = Elephant(23.5,"Manny")
        var dog = Dog(30.2,"Jack")

        println("Name ${dog.name} + ${Animal.countTime(dog.speed)}")

    }
}