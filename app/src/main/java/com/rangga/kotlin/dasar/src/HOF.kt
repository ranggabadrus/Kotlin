package com.rangga.kotlin.dasar.src

fun main() {
    fun rangga(nama:String, ubah : (String)->String):String{
        return "com.rangga.kotlin.dasar.src.hello ${ubah(nama)}"
    }

    val a = rangga("rangga", {nama:String->nama.uppercase()})
    println(a)
}