package oop_108839_FarellTimothy.week10

// Kelas generic menggunakan <T> sebagai placeholder tipe data
class Box<T>(var value: T)

fun main() {
    // Contoh penggunaan (Opsional untuk tes)
    val intBox = Box(100)
    val stringBox = Box("Halo Generics")

    println("Isi Int Box: ${intBox.value}")
    println("Isi String Box: ${stringBox.value}")
}