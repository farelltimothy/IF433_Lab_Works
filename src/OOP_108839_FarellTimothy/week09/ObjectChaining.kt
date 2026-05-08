package OOP_108839_FarellTimothy.week09

// Data class untuk merepresentasikan entitas Student
data class Student(val name: String, val gpa: Double)

fun main() {
    // Membuat list data objek Student
    val students = listOf(
        Student("Andi", 3.2),
        Student("Budi", 3.9),
        Student("Citra", 2.8),
        Student("Dewi", 3.7)
    )

    println("Daftar Mahasiswa: $students")
}