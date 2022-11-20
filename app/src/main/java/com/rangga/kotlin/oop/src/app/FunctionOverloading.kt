package com.rangga.kotlin.oop.src.app

import com.rangga.kotlin.oop.src.data.Person

fun main() {
    val eko = Person()
    eko.firstName = "Eko"

    eko.sayHello("Budi")
    eko.sayHello("Joko", "Nugroho")
}