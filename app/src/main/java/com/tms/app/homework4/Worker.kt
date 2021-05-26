package com.tms.app.homework4

class Worker(var name: String, var salary: String) : Employee(name, salary) {

    fun work() = println("$name works")
}