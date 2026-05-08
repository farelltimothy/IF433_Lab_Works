package oop_108839_FarellTimothy.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    // Perangkat 1: Pencahayaan
    SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }

    // Perangkat 2: Keamanan (Checkpoint 15)
    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }
}