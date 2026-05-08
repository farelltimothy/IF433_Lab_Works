package oop_108839_FarellTimothy.week10

class MathBox<T : Number>(val value1: T, val value2: T) {

    fun sum(): Double {
        return value1.toDouble() + value2.toDouble()
    }
}

fun main() {
    val intMath = MathBox(10, 20)
    val doubleMath = MathBox(5.5, 4.5)

    println("Hasil Sum Int: ${intMath.sum()}")
    println("Hasil Sum Double: ${doubleMath.sum()}")

}