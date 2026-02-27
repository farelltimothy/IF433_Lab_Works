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

    val tax: Double
        get() = salary * 0.1

    private var performanceRating: Int = 3

    fun increasePerformance() {
        if (performanceRating < 5) {
            performanceRating++
            println("Kinerja $name meningkat! Rating: $performanceRating")
        } else {
            println("Rating $name sudah maksimal!")
        }
    }

    fun printStatus() {
        println("Karyawan: $name, Rating: $performanceRating")
    }
}