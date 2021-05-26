package com.tms.app.homework4

class Manager(var name: String, var salary: String): Employee(name, salary) {
    var workersOfFirst = listOf<Worker>(
        Worker("Alan","1000$"),
        Worker("Rick","1000$"),
        Worker("Nick","1000$"),
    )
    var workersOfSecond = listOf<Worker>(
        Worker("Sam","1000$"),
        Worker("Aaron","1000$"),
        Worker("Viktor","1000$"),
    )
    var workersOfThird = listOf<Worker>(
        Worker("Mike","1000$"),
        Worker("G","1000$"),
        Worker("Sam","1000$"),
    )

    var workersOfFourth = listOf<Worker>(
        Worker("Aaron","1000$"),
        Worker("Viktor","1000$"),
        Worker("Mike","1000$")
    )
}
