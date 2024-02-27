package com.example.kotlinmaraphone.day_2

fun main() {
    println("Please enter a number: ")
    var inputString = readln()
    var inputNumber = inputString.toIntOrNull()
    val multiplier = 5
    print("Result of operation is: ")
    if (inputNumber != null) {
        print(inputNumber * multiplier)
    } else {
        print("Error")
    }
//    val intNull: String? = null
}