package com.tms.app.homework4

abstract class Employee(
      var name: String,
      var salary: String,
      val listEmployee: MutableList<Employee>
){
}