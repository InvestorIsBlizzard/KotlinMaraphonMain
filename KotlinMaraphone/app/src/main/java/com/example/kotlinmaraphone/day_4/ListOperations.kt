package com.example.kotlinmaraphone.day_4

fun main() {
    val fruitsList = mutableListOf("apple", "banan", "pineapple", "blueberry", "cherry")
    fruitsList.add("blackberry")
    fruitsList.remove("blackberry")
   val hasApple = fruitsList.contains("apple")
    if(hasApple){
        println("Has Apple in the list")
    } else{
        println("No Apple in the list")
    }
}