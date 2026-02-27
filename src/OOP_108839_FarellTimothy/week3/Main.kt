package OOP_108839_FarellTimothy.week3

fun main() {
    val e = Employee("Budi")

    // LANGKAH 6: Komentari atau hapus baris simulasi error
    // e.salary = -1000  <-- Ini yang di-cleanup

    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    // Menampilkan pajak (Computed Property)
    println("Pajak: ${e.tax}")

    // Sisa kode lainnya (Weapon/Player) tetap dibiarkan
    println("\n--- TASK 3: IMPLEMENTASI PLAYER ---")
    val player = Player("Farell")
    player.addXp(50)
    player.addXp(60)
}