package com.rangga.kotlin.dasar.src

infix fun String.to(type: String): String {
    return if (type == "UP") {
        this.uppercase()
    } else {
        this.lowercase()
    }
}

fun main() {
    val result = "Eko Kurniawan" to "LO"
    println(result)
}