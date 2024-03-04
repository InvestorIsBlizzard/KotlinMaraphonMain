package com.example.inheritanceapp

// Derived Class of BaseClass
// Inherits from BaseClass
open class Secondary : BaseClass() {

    override fun role() {
        println("Knight of the House of BaseClass")
    }
}