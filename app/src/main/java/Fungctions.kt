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

//named argument
//named argument merupakan cara untuk memanggil fungsi dengan menyebutkan nama parameternya
fun withNamedArgument(firstName: String, lastName: String, age: Int) {
    println()
    println("== withNameArgument ==")
    println("Hello, $firstName $lastName you are $age years old")
}