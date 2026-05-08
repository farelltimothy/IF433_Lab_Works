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

    // Perangkat 2: Keamanan
    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }

    // Perangkat 3 & 4: AC & Pet Care (Checkpoint 16)
    val acInverter = run {
        val device = SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
        device // Menjadi return value untuk acInverter
    }
    homeDevices.add(acInverter)

    homeDevices.add(SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10))
}