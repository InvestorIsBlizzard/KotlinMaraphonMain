package com.example.kotlinmaraphone.day_4.Bank

import com.example.kotlinmaraphone.day_4.Bank.BankAccount

fun main() {
    val myBankAccount = BankAccount("Serafim", 1300.0)
    myBankAccount.deposit(200.0)
    myBankAccount.withdraw(1200.0)
    myBankAccount.deposit(3000.0)
    myBankAccount.deposit(2000.0)
    myBankAccount.withdraw(3333.15)
    myBankAccount.displayTransactionHistory()
    myBankAccount.displayBalance()

    val newBankAccount = BankAccount("Sarah", 0.0)
    newBankAccount.deposit(100.0)
    newBankAccount.withdraw(10.0)
    newBankAccount.deposit(300.0)
    newBankAccount.displayTransactionHistory()
    newBankAccount.displayBalance()
}