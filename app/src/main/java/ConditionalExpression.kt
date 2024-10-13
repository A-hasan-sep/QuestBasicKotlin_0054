package com.example.test

// conditional expression
// conditional expression adalah ekspersi yang mengembalikan nilai berdasarkan kondisi tertentu
// conditional expression menggunakan if-else, when, dan try-catch
fun ConditionalStatement() {
    println("=== Conditional Expression ===")

    //if-else
    val number = 10
    if (number > 0) {
        println("number is positive")
    } else {
        println("number is negative")
    }

    //when
    val day = 1
    when (day) {
        1 -> println("senin")
        2 -> println("selasa")
        3 -> println("rabu")
        4 -> println("kamis")
        5 -> println("jumat")
        6 -> println("sabtu")
        7 -> println("minggu")
        else -> println("invalid day")
    }

    //try-catch
    val value = "10"
    try {
        val result = value.toInt()
        println("result: $result")
    } catch (e: NumberFormatException) {
        println("invalid number")
    }
}
