package com.example.test

// list adalah kumpulan data yang disusun secara berurutan dari
// list bersifat ordered, artinya data yang dimasukkan akan memiliki posisi yang sesuai urutan
// list bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// list read-only menggunakan listOf() sedangkan list mutable menggunakan mutableListOf()

fun ContohList() {
    println("=== List ===")
    // list read-only
    val readOnlyAbjad = listOf("a", "b", "c")
    println(readOnlyAbjad)

    // list mutable
    val shape: MutableList<String> = mutableListOf("persegi", "lingkaran", "segitiga")
    println(shape)

    // menambahkan data ke dalam list mutable
    shape.add("persegi")
    println(shape)

    // menghapus data dari dalam list mutable
    shape.remove("segitiga")
    println(shape)

    // mengubah data dalam list mutable
    shape[0] = "trapesium"
    println(shape)

    // list read-only
    val shapeLocked: List<String> = shape
    println(shapeLocked)
}