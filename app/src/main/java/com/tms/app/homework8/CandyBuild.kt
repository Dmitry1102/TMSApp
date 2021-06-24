package com.tms.app.homework8

import android.util.Log

object CandyBuild {
    private val listCandy: MutableList<Candy> = mutableListOf()
    private val activityList = ActivityList()

    fun getCandiesList():MutableList<Candy> {
        for (i in 0..300) {
            when {
                i < 100 -> {
                    listCandy.add(Candy("snickers", activityList.buildCode()))
                }
                i in 101..199 -> {
                    listCandy.add(Candy("mars", activityList.buildCode()))
                }
                i in 201..299 -> {
                    listCandy.add(Candy("twix", activityList.buildCode()))
                }
            }

        }

        return listCandy
    }

}