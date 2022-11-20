package com.rangga.kotlin.oop.src.rangga

open class Orang(firstname: String, lastname: String) {
    var namadepan: String = firstname
    var namaakhir = lastname

    init {
        println("NAMA DEPAN ADALAH ${namadepan}")
    }

    constructor(lastname: String) : this(firstname = "Rangga", lastname){
        println("NAMA BELAKANG ADALAH ${lastname} & NAMA DEPAN ")
    }

    open fun cekNama(){
        println("awal : $namadepan & akhir : $namaakhir")
    }
    }

class Manusia (awal:String, akhir:String) : Orang(awal, akhir){
    val awal = super.namadepan
    val akhir = super.namaakhir

    override fun cekNama(){
        super.cekNama()
    }
}