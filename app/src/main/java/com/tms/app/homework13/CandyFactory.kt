package com.tms.app.homework13



object CandyFactory {
    private val listCandy: MutableList<Candy> = mutableListOf()

    fun getCandiesList():MutableList<Candy> {
        for (i in 0..300) {
            when {
                i < 100 -> {
                    listCandy.add(Candy(GeneralActivity.SNICKERS, GeneralActivity.buildCode()))
                }
                i in 101..200 -> {
                    listCandy.add(Candy(GeneralActivity.MARS, GeneralActivity.buildCode()))
                }
                i in 201..300 -> {
                    listCandy.add(Candy(GeneralActivity.TWIX, GeneralActivity.buildCode()))
                }
            }

        }
        return listCandy
    }

}