package com.example.kotlinmaraphone.day_2

fun main () {
    print("Please Enter your age as a whole number: ")
    var age = 0
    val enteredValue = readln()
    age = enteredValue.toInt()
    if(age in 18..39){
        println("You can enter the club.")
    } else {
        println("You cannot go into the club, please go home.")
    }
}
