package oop_108839_FarellTimothy.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }

    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }

    val acInverter = run {
        val device = SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
        device
    }
    homeDevices.add(acInverter)

    homeDevices.add(SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10))

    println("\n=== SEARCH DEVICE ===")
    val searchResult = homeDevices.find { it.category == "Camera" }

    searchResult?.let {
        println("Perangkat Ditemukan:")
        println(it.diagnose())
    }

    println("\n=== SMART HOME DASHBOARD SUMMARY ===")
    with(homeDevices) {
        val totalPower = sumOf { it.powerLoad }
        println("Status Sistem: AKTIF")
        println("Jumlah Perangkat Terkoneksi: ${this.size}")
        println("Total Konsumsi Daya: $totalPower Watt")
        println("------------------------------------")
    }

    println("\n=== POWER CALCULATION ===")
    // Menggunakan run untuk mengeksekusi iterasi sumOf
    val totalPower = homeDevices.run {
        sumOf { it.powerLoad }
    }

    println("Total penggunaan daya saat ini: $totalPower Watt")
}

