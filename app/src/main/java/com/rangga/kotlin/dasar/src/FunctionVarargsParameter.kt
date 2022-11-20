package com.rangga.kotlin.dasar.src

fun hitungTotal(name: String, vararg values: Int): Int {
    var total = 0

    values.map { total += it }
//    for (value in values) {
//        total += value
//    }

    return total;
}

fun main() {
    // val values = arrayOf(10,10,10,10)
    val result = hitungTotal("Eko", 10, 10, 10)

    println(result)
}