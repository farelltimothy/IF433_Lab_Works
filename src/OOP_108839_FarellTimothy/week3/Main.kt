package OOP_108839_FarellTimothy.week3

fun main() {
    val e = Employee("Budi")

    println("--- Testing Salary Validation ---")
    e.salary = -1000
    println("Gaji setelah error: ${e.salary}")

    e.salary = 5000000
    println("Gaji normal: ${e.salary}")

    println("\n--- Testing Performance ---")
    e.printStatus()
    e.increasePerformance()


    println("\n--- Testing Computed Property ---")
    println("Pajak (10%): ${e.tax}")

    println("\n--- TASK 3: IMPLEMENTASI PLAYER ---")
    val player = Player("Farell")
    player.addXp(50)
    player.addXp(60)
}