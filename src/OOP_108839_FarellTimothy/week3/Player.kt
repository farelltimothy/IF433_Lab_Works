package OOP_108839_FarellTimothy.week3

class Player(val username: String) {
    // Properti private agar tidak bisa diubah langsung (Tugas 2.2)
    private var xp: Int = 0

    // Computed Property untuk menghitung level (Tugas 2.3)
    val level: Int
        get() = (xp / 100) + 1

    // Fungsi menambah XP dengan validasi (Tugas 2.4)
    fun addXp(amount: Int) {
        if (amount > 0) {
            val oldLevel = level // Simpan level lama sebelum XP ditambah
            xp += amount
            println("$username mendapatkan $amount XP.")

            // Cek jika terjadi kenaikan level
            if (level > oldLevel) {
                println("Level Up! Selamat $username naik ke level $level")
            }
        } else {
            println("Jumlah XP harus positif!")
        }
    }
}