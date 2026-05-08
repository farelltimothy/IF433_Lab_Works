package OOP_108839_FarellTimothy.week09

fun main() {
    println("=== TEST LIST ===")

    // Immutable List: Isinya TIDAK bisa diubah setelah dibuat
    val frameworks: List<String> = listOf("Kotlin", "Java", "C++")

    // frameworks.add("Python") // JIKA UNCOMMENT INI AKAN ERROR!

    println("Immutable List: $frameworks")

    println() // Memberi baris baru agar rapi

    // Mutable List: Isinya BISA ditambah, diubah, atau dikurangi
    val scores: MutableList<Int> = mutableListOf(85, 90)

    scores.add(95)    // Menambah data 95 ke list
    scores[0] = 88    // Mengubah data indeks ke-0 (85 jadi 88)

    println("Mutable List: $scores")

    println("\n=== TEST SET ===")

    // setOf: Membuat Set immutable (tidak bisa diubah)
    // Perhatikan ada angka 2 dan 3 yang ditulis dua kali
    val uniqueNumbers = setOf(1, 2, 2, 3, 3, 4)
    println("Unique Numbers (Set): $uniqueNumbers") // Duplikat otomatis hilang

    // mutableSetOf: Membuat Set yang bisa ditambah/dikurangi
    val activeUsers = mutableSetOf("UserA", "UserB")
    activeUsers.add("UserC")
    activeUsers.add("UserA") // Akan diabaikan karena "UserA" sudah ada

    println("Active Users: $activeUsers")
}