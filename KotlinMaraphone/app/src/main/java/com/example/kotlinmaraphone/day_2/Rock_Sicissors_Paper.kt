package com.example.kotlinmaraphone.day_2

fun main() {
    var computerChoice: String = ""
    var playerChoice: String = ""
    while(playerChoice != "ROCK" && playerChoice != "SCISSORS" && playerChoice != "PAPER"){
        println("Rock, Scissors or Paper? Enter your choice!")
        playerChoice = readln().uppercase()
    }


    val randomNumber = (1..3).random()
    when (randomNumber) {

        1 -> computerChoice = "ROCK"
        2 -> computerChoice = "SCISSORS"
        3 -> computerChoice = "PAPER"
    }
    println(computerChoice)

    val winner = when {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "ROCK" && computerChoice == "SCISSORS" -> "Player"
        playerChoice == "PAPER" && computerChoice == "ROCK" -> "Player"
        playerChoice == "SCISSORS" && computerChoice == "PAPER" -> "Player"
        else -> "Computer"
    }

    if (winner == "Tie") {
        println("It's tie")
    } else {
        println("$winner won!")
    }
}