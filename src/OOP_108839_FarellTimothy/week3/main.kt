package OOP_108839_FarellTimothy.week3

fun main() {
    val e = Employee("Budi")
    println("--- Test Error ---")

    // Baris di bawah ini akan memicu ledakan program (StackOverflowError)
    e.salary = 5000
}