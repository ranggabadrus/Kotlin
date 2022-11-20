package com.rangga.kotlin.dasar.src

fun main() {
    fun ubahnama(nama: String, ubah: (String) -> String): String {
        return ubah(nama)
    }

    println(ubahnama("RANGGA", { a -> a.lowercase() }))
}