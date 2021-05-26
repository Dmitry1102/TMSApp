package com.tms.app.homework2

object SingletonOutput {
    private fun initCar(): List<Car>{
        return listOf(
            Car("Mazda", "black", 3f,"AGAG235325"),
            Car("Honda", "white", 2f,"AGAG238695"),
            Car("Toyota", "yellow", 3.5f,"AGgdfdhf325"),
            Car("Nissan", "green", 1.5f,"AGAG2211125"),
            Car("Mazda", "blue", 2.5f,"AGAG235325"),
            Car("Fiat", "black", 3.1f,"AGAG235325")

        )

    }

    fun returnCar(){
        initCar().iterator().forEach { car -> println(car.infoCar()) }
    }
}