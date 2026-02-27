package OOP_108839_FarellTimothy.week04

fun main() {

    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")

    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()      // Memanggil method milik sendiri
    myCar.honk()           // Memanggil method yang sudah di-override
    myCar.accelerate()     // Memanggil gabungan method Parent dan Child

    println("\n--- Testing Electric Car ---")
    val myEV = ElectricCar(brand = "Tesla Model 3", numberOfDoors = 4, batteryCapacity = 85)
    myEV.accelerate()
    myEV.honk()
    myEV.openTrunk()

    println("\n=== Testing Employee Hierarchy ===")

    val manager = Manager(name = "Farell Timothy", baseSalary = 10000000)
    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    val developer = Developer(name = "John Thor", baseSalary = 8000000, programmingLanguage = "Kotlin")
    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}