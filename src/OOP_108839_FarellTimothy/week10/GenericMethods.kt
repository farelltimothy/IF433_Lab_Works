package oop_108839_FarellTimothy.week10

// Definisi fungsi generik dengan awalan <T> sebelum nama fungsi
fun <T> printData(data: T) {
    println("Data yang diterima: $data")
}

fun main() {
    // Menguji fungsi dengan berbagai tipe data
    printData(12345)                 // Tipe Int
    printData("Belajar Kotlin")      // Tipe String
    printData(98.5)                  // Tipe Double
    printData(true)                  // Tipe Boolean
}