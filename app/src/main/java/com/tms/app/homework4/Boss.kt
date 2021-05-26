package com.tms.app.homework4

class Boss(var name: String, var salary: String) : Employee(name, salary) {

    val managersOfFirst = listOf<Manager>(
        Manager("Clint", "2500$"),
        Manager("Erick","2600$"),
    )

    val managersOfSecond = listOf<Manager>(
        Manager("Sam","2600$"),
        Manager("Nick","2300$")
    )


}