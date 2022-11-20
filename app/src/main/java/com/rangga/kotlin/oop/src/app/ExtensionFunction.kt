package app

import com.rangga.kotlin.oop.src.data.Student
import com.rangga.kotlin.oop.src.data.sayHello
import com.rangga.kotlin.oop.src.data.upperName

fun main() {
    val student: Student? = Student("Eko", 15)
    student.sayHello("Budi")
    println(student?.upperName)
}