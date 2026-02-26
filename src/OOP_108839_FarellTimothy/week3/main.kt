package OOP_108839_FarellTimothy.week3

fun main() {
    val e = Employee("Budi")

    println("--- Test Validasi Gaji ---")

    e.salary = 5000
    println("Gaji ${e.name}: ${e.salary}")

    e.salary = -1000
    println("Gaji ${e.name} setelah input negatif: ${e.salary}")
}