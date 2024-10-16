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

//default parameter value
//default parameter value merupakan cara untuk memberikan nilai default pada parameter fungsi
fun withDefaultParameter(firstName: String = "asep", lastName: String = "banyak", age: Int = 20) {
    println()
    println("== withDefaultParameter ==")
    println("Hello, $firstName $lastName you are $age years old")
}

fun withReturn(panjang: Int, lebar: Int) {
    return println(panjang * lebar)
}

fun main() {
    withoutParameter()
    withParameter("Hasan")
    withNamedArgument(firstName = "Hasan", lastName = "Ridlo", age = 20)
    withDefaultParameter()
    withReturn(5, 10)

}