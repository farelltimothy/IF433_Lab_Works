package oop_108839_FarellTimothy.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Berhasil menambahkan: ${device.name}")
    }

    fun turnOffAllSwitches() {
        println("\n[Sistem]: Mematikan semua perangkat switchable...")
        for (device in devices) {
            // Smart Casting menggunakan keyword 'is'
            if (device is Switchable) {
                device.turnOff()

                fun activateSecurityMode() {
                    println("\n[Sistem]: MENGAKTIFKAN MODE KEAMANAN!")
                    for (device in devices) {
                        // Jika perangkat bisa merekam
                        if (device is Recordable) {
                            device.startRecord()
                        }

                        // Khusus SmartSpeaker, putar sirine
                        if (device is SmartSpeaker) {
                            device.playMusic("Sirine Peringatan")
            }
        }
    }
}



