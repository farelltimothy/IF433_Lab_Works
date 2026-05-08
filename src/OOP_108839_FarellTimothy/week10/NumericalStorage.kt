package oop_108839_FarellTimothy.week10

class MathBox<T : Number>(val value1: T, val value2: T) {

    fun sum(): Double {
        return value1.toDouble() + value2.toDouble()
    }
}


fun <T> getMax(a: T, b: T): T where T : Comparable<T> {
    return if (a > b) a else b
}

fun main() {
    val intMath = MathBox(10, 20)
    val doubleMath = MathBox(5.5, 4.5)

    println("Hasil Sum Int: ${intMath.sum()}")
    println("Hasil Sum Double: ${doubleMath.sum()}")




    fun main() {
        // Testing getMax dengan angka
        val maxInt = getMax(50, 100)
        println("Nilai terbesar (Int): $maxInt")

        // Testing getMax dengan teks (Alfabetis)
        val maxString = getMax("Apple", "Zebra")
        println("Nilai terbesar (String): $maxString")
    }

}