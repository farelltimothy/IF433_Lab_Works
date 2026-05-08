package oop_108839_FarellTimothy.week10

// Kelas PairBox menerima dua tipe berbeda, K (Key) dan V (Value)
class PairBox<K, V>(val key: K, val value: V)

fun main() {
    // Contoh penggunaan dengan tipe berbeda: String dan Int
    val studentScore = PairBox("Farell", 95)

    // Contoh penggunaan dengan tipe berbeda: Int dan Boolean
    val statusCheck = PairBox(200, true)

    println("Key: ${studentScore.key}, Value: ${studentScore.value}")
    println("Status Code: ${statusCheck.key}, Success: ${statusCheck.value}")
}