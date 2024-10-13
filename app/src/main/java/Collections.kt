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

// set adalah kumpulan data yang tidak disusun secara berurutan dan hanya menyimpan data yang unik(tidak ada duplikasi)
// set bersifat unordered, artinya data yang dimasukkan tidak akan memiliki posisi yang sesuai urutan
// set bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// set read-only menggunakan setOf() sedangkan set mutable menggunakan mutableSetOf()

fun ContohSet() {
    println()
    println("=== Set ===")

    //set raed-only
    val readOnlyAbjad = setOf("d", "e", "f")
    println(readOnlyAbjad)

    //set mutable
    val shape: MutableSet<String> = mutableSetOf("persegi", "lingkaran", "segitiga")
    println(shape)

    // menambahkan data ke dalam set mutable
    shape.add("trapesium")
    println(shape)

    // menghapus data dari dalam set mutable
    shape.remove("segitiga")

    //set read-only
    val shapeLocked: Set<String> = shape
    println(shapeLocked)
}

// map adalah kumpulan data yang terdiri dari pasangan kunci-nilai(key-value)
// map bersifat unordered, artinya data yang dimasukkan tidak akan memiliki posisi yang sesuai urutan
// map bersifat mutable dan read-only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// map read-only meggunakan mapOf() sedangkan map mutable menggunakan mutableMapOf()

fun ContohMap() {

    println()
    println("=== Map ===")
    //map read-only
    val readOnlyShape: Map<String, Int> = mapOf("persegi" to 4, "lingkaran" to 0, "segitiga" to 3)
    println(readOnlyShape)

    //map mutable
    val shape: MutableMap<String, Int> =
        mutableMapOf("persegi" to 4, "lingkaran" to 0, "segitiga" to 3)
    println(shape)

    //menambahkan data ke dalam map mutable
    shape["trapesium"] = 4
    println(shape)

    //menghapus data dari dalam map mutable
    shape.remove("lingkaran")
    println(shape)

    //mengubah data dalam map mutable
    shape["persegi"] = 6
    println(shape)

    //map read-only
    val shapeLocked: Map<String, Int> = shape
    println(shapeLocked)
}

// contoh penggunaan list, set, dan map

fun main() {
    ContohList()
    ContohSet()
    ContohMap()
}