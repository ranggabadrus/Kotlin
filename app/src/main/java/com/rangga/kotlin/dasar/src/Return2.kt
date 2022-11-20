package com.rangga.kotlin.dasar.src

fun main() {

    fun returnif(nama: String): String {
        when (nama) {
            "" -> return "Hiii"
            else -> return "Halo"
        }
    }

    println(returnif("Rangga"))
}