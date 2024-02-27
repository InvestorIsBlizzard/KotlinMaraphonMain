package com.example.kotlinmaraphone.day_3.Book

fun main() {
    val myBook = Book()
    println(myBook.title)
    println(myBook.author)
    println(myBook.yearPublished)

    val customBook = Book("War and Peace", "Tolstoy", 1869)
    println("My book:")
    println(customBook.title)
    println(customBook.author)
    println(customBook.yearPublished)
}

