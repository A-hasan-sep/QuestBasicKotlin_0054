package com.example.test

//Lambada Functions
//Lambada functions adalah fungsi yang tidak memiliki nama
//Lambada functions biasanya digunakan untuk membuat fungsi yang sederhana
//Lambada functions menggunakan tanda panah (->) untuk memisahkan parameter dan body fungsi

fun uppercaseString(string: String): String {
    return string.uppercase()
}

//dapat ditulis dalam ekspresi lambada sbb :
fun main() {
    uppercaseString("hello bang")
    println({ string: String -> string.uppercase() }("hello bang"))
    //HELLO BANG
}