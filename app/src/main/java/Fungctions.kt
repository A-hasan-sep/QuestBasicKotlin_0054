package com.example.test

fun withoutParameter() {
    println("== Without Parameter ==")
    println("Hello World")
}

fun withParameter(name: String) {
    println()
    println("== With Parameter ==")
    println("Hello, $name")
}