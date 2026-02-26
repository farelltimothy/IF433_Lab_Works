package OOP_108839_FarellTimothy.week3

fun main() {
    val e = Employee("Budi")

    println("--- Test Validasi Gaji ---")

    e.salary = 5000
    println("Gaji ${e.name}: ${e.salary}")

    println("\n--- Test Private & Encapsulation ---")

    // Mencoba memanggil e.performanceRating akan ERROR karena bersifat private
    // e.performanceRating = 5

    e.printStatus() // Melihat status awal
    e.increasePerformance() // Meningkatkan rating melalui fungsi publik
    e.printStatus() // Melihat status setelah ditingkatkan
}