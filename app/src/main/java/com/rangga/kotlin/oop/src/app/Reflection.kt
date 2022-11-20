package com.rangga.kotlin.oop.src.app
//
//import annotations.NotBlank
//import data.CreateCategoryRequest
//import data.CreateProductRequest
//import exception.ValidationException
//import kotlin.reflect.full.findAnnotation
//import kotlin.reflect.full.memberProperties
//
//fun validateRequest(request: Any) {
//    val clazz = request::class
//    val properties = clazz.memberProperties
//
//    // iterate com.rangga.kotlin.dasar.src.satu com.rangga.kotlin.dasar.src.satu, lalu cek kalo ada annotation @NotBlank
//    for (property in properties) {
//        if (property.findAnnotation<NotBlank>() != null) {
//            val value = property.call(request)
//            when (value) {
//                is String -> {
//                    if ("" == value) {
//                        throw ValidationException("${property.name} is blank")
//                    }
//                }
//            }
//        }
//    }
//}
//
//fun com.rangga.kotlin.dasar.src.com.rangga.kotlin.dasar.src.com.rangga.kotlin.dasar.src.com.rangga.kotlin.dasar.src.com.rangga.kotlin.dasar.src.com.rangga.kotlin.dasar.src.com.rangga.kotlin.dasar.src.com.rangga.kotlin.dasar.src.com.rangga.kotlin.dasar.src.com.rangga.kotlin.dasar.src.com.rangga.kotlin.dasar.src.com.rangga.kotlin.dasar.src.com.rangga.kotlin.dasar.src.com.rangga.kotlin.dasar.src.com.rangga.kotlin.dasar.src.com.rangga.kotlin.dasar.src.com.rangga.kotlin.dasar.src.com.rangga.kotlin.dasar.src.com.rangga.kotlin.dasar.src.com.rangga.kotlin.dasar.src.com.rangga.kotlin.dasar.src.com.rangga.kotlin.dasar.src.com.rangga.kotlin.dasar.src.com.rangga.kotlin.dasar.src.main() {
//    val request = CreateProductRequest("1", "Indomie", 2000)
//    validateRequest(request)
//
//    val request2 = CreateCategoryRequest("F", "")
//    validateRequest(request2)
//}