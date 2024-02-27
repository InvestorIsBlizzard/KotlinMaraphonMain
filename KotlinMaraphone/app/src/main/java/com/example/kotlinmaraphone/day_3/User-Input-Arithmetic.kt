package com.example.kotlinmaraphone.day_3

fun main() {

    println("Enter number 1")
    val num1String = readln()
    val num1Int = num1String.toInt()

    println("Enter number 2")
    val num2String = readln()
    val num2Int = num2String.toInt()

    //val myResult = add(num1Int, num2Int)
    val myResult = devide(num1Int, num2Int)
    println("Result is $myResult")
}
fun devide(num1: Int, num2: Int): Double{
    val result = num1/num2.toDouble()
    return result
}

fun add(num1:Int,num2:Int): Int{
    val result = num1+num2
    return result
}