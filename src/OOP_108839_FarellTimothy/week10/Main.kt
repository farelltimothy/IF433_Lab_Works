package oop_108839_FarellTimothy.week10

fun main() {
    println("=== TEST GENERIC CLASS ===")

    // Menggunakan kelas Box untuk menyimpan data Int
    val intBox = Box(100)

    // Menggunakan kelas Box untuk menyimpan data String
    val stringBox = Box("Generics in Kotlin")

    // Mencetak nilai tanpa perlu casting manual
    println("Isi intBox: ${intBox.value}")
    println("Isi stringBox: ${stringBox.value}")
}