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
}