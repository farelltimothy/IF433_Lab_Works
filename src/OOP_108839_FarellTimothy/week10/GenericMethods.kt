package oop_108839_FarellTimothy.week10

fun <T> printData(data: T) {
    println("Data yang diterima: $data")
}

fun <T> processData(input: T): T {
    return input
}

fun main() {
    println("=== TESTING GENERIC METHODS ===")

    printData(2024)
    printData("Halo Dunia")
    printData(3.14)

    println("\n--- Testing Return Type ---")

    val hasilInt = processData(500)
    val hasilString = processData("Kotlin Generics")

    println("Hasil Process Int: $hasilInt")
    println("Hasil Process String: $hasilString")
}