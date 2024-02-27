package com.example.kotlinmaraphone.day_4.Bank

class BankAccount (var accountHolder: String, var balance: Double) {
    private val transactionHistory = mutableListOf<String>()
    fun deposit(amount: Double) {
        balance += amount
        transactionHistory.add("$accountHolder deposited $$amount")
    }
    fun withdraw(amount: Double) {
        if (amount <= balance) {
            balance -= amount
            transactionHistory.add("$accountHolder withdrew $$amount")
        } else {
            println("You do not have the funds to withdraw $$amount")
        }
    }
    fun displayTransactionHistory() {
        for (transaction in transactionHistory) {
            println(transaction)
        }
    }
    fun displayBalance() {
        println("${accountHolder}'s balance is ${balance}")
    }
}



