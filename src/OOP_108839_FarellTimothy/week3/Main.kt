package OOP_108839_FarellTimothy.week3

fun main() {
    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak: ${e.tax}")

    val w = Weapon("Excalibur")

    // Mengetes setter damage
    println("--- Testing Weapon Damage ---")
    w.damage = 0
    println("Weapon: ${w.name}, Damage: ${w.damage}, Tier: ${w.tier}")

    // Mengetes validasi (Langkah selanjutnya untuk Commit 8)
    w.damage = 1200 // Ini akan memicu peringatan "Overpowered"
    println("Final Check -> Damage: ${w.damage}, Tier: ${w.tier}")

}