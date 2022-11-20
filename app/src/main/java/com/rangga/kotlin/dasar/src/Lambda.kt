package com.rangga.kotlin.dasar.src

fun main() {

    val lambda: (Int, Int) -> Int = { a: Int, b: Int -> a + b }

    println(lambda(2, 3))

    fun noLambda(a:Int, b:Int):Int{
        return a*b
    }
    println(noLambda(2, 3))

}