package com.rangga.kotlin.dasar.src

fun main() {
    fun namaubah(angka: Int, ubah: (Int) -> Int): Int {
        return ubah(angka + angka)
    }

    println(namaubah(2, { it }))
}
