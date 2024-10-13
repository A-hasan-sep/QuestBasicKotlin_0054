package com.example.test

fun nullSafety() {
    //neverNull yang punya tipe data String
    var neverNull: String = "This can't be null"

    //throw a compiler error(melemparkan kesalahan kompiler)
    //neverNull = null

    //nullable yang punya tipe data String?
    var nullable: String? = "You can keep a null here"
    //ini OKE
    nullable = null

    //untuk mengecek kondisi null atau tidak
    if (neverNull == null) {
        println("inferredNonNull is null")
    } else {
        println("inferredNonNull is not null")
    }

    // aman untuk memanggil operator
    println(neverNull.length) // 18
    println(nullable?.length) // null

    //notNull tidak menerima nilai null
    fun strLength(notNull: String): Int {
        return notNull.length
    }

    println(strLength(neverNull)) //18
}

fun main() {
    nullSafety()
}