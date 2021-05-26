package com.tms.app.homework4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tms.app.R
import com.tms.app.homework3.Animal
import com.tms.app.homework3.Dog
import com.tms.app.homework3.Elephant

class Main: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boss1 = Boss("Jack","12000$")
        val boss2 = Boss("Dean","11000$")

        fun countWorkers(){

        }

        val list = listOf<Employee>(
            boss1,
            boss2,

            boss1.managersOfFirst.get(0),
            boss1.managersOfFirst.get(1),

            boss2.managersOfSecond.get(0),
            boss2.managersOfSecond.get(1),

            boss1.managersOfFirst.get(0).workersOfFirst.get(0),
            boss1.managersOfFirst.get(0).workersOfFirst.get(1),
            boss1.managersOfFirst.get(0).workersOfFirst.get(2),

            boss1.managersOfFirst.get(1).workersOfSecond.get(0),
            boss1.managersOfFirst.get(1).workersOfSecond.get(1),
            boss1.managersOfFirst.get(1).workersOfSecond.get(2),

            boss2.managersOfSecond.get(0).workersOfThird.get(0),
            boss2.managersOfSecond.get(0).workersOfThird.get(1),
            boss2.managersOfSecond.get(0).workersOfThird.get(2),

            boss2.managersOfSecond.get(1).workersOfFourth.get(0),
            boss2.managersOfSecond.get(1).workersOfFourth.get(1),
            boss2.managersOfSecond.get(1).workersOfFourth.get(2)
        )

        fun ouputInfo(list: List<Employee>){
            list.iterator().forEach {
                if(it is Boss ){
                    if()

                }

            }
        }


    }

}