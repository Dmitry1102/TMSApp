package com.tms.app.homework11


object CandyBuild {
    private val listCandy: MutableList<Candy> = mutableListOf()
    private val activityList = ActivityList()

    fun getCandiesList():MutableList<Candy> {
        for (i in 0..300) {
            when {
                i < 100 -> {
                    listCandy.add(Candy("snickers", activityList.buildCode()))
                }
                i in 101..200 -> {
                    listCandy.add(Candy("mars", activityList.buildCode()))
                }
                i in 201..300 -> {
                    listCandy.add(Candy("twix", activityList.buildCode()))
                }
            }

        }
        return listCandy
    }

}