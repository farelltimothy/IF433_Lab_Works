package oop_108839_FarellTimothy.week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("[$name - $id]: Sistem keamanan aktif.")
        startRecord()
    }

    override fun turnOff() {
        println("[$name - $id]: Sistem keamanan nonaktif.")
        stopRecord()
    }

    override fun startRecord() {
        println("[$name]: Sensor gerak mendeteksi aktivitas. Mulai merekam...")
    }
}