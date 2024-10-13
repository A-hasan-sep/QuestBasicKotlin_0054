package com.example.test

class Motor

class Contact(val id: Int, var email: String)

fun main() {
    val contact = Contact(1, "hasan.m.ft20@mail.umy.ac.id")

    // Mengakses properti email
    println(contact.email)

    // Mengubah nilai properti email
    contact.email = "hsnmmr3@gmail.com"

    // Mengakses properti email yang telah diubah
    println(contact.email)

}