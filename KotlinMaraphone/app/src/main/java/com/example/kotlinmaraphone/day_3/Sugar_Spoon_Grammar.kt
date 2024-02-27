package com.example.kotlinmaraphone.day_3

fun main(){
    println("Who is this coffe for?")
    val name = readln()
    println("How many pieces of sugar do you want?")
    val sugarCount = readln()
    val sugarCountInt = sugarCount.toInt()
    makeCoffee(sugarCountInt, name)

}

fun makeCoffee(sugarCount: Int, name: String) {
    if (sugarCount == 1) {
        println("Coffe with 1 spoon of sugar $name")
    } else if (sugarCount == 0) {
        println("Coffe without sugar for $name")
    } else {
        println("Coffe with $sugarCount spoons of sugar for $name")
    }
}


