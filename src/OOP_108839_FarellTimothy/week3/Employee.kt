package OOP_108839_FarellTimothy.week3

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Gaji tidak boleh negatif! Di-set ke 0.")
                field = 0
            } else {
                field = value
            }
        }

    private var performanceRating: Int = 3

    fun increasePerformance() {
        performanceRating++
        println("Kinerja $name meningkat! Rating: $performanceRating")
    }

    fun printStatus() {
        println("Karyawan: $name, Rating: $performanceRating")
    }

    // --- TAMBAHKAN KODE INI (LANGKAH 5) ---
    // Tax (Pajak) dihitung 10% dari gaji saat ini
    val tax: Double
        get() = salary * 0.1
}