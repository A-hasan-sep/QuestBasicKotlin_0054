package com.example.test

// data class
// data class adalah kelas yang digunakan untuk menyimpan data
// data class menyediakan fungsi-fungsi untuk meng-override fungsi equals(), hashCode(), dan toString()
// data class juga menyediakan fungsi copy() untuk membuat salinan objek dengan beberapa perubahan

data class DataClass(
    val id: Int,
    var email: String
)

fun main() {
    val data = DataClass(1, "hasan.m.ft20@mail.umy.ac.id")
    println(data)

    //fungsi Equals
    val data2 = DataClass(1, "hsnmmr3@gmail.com")
    println(data == data2) //false

    //fungsi copy
    val data3 = data.copy()
    println(data3)

    //fungsi copy dengan perubahan
    val data4 = data.copy(email = "asep@gmail.com")
    println(data4)
}