package oop_108839_FarellTimothy.week06

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("[$name - $id]: Lampu dinyalakan. Cahaya putih hangat memenuhi ruangan.")
    }

    override fun turnOff() {
        println("[$name - $id]: Lampu dimatikan. Ruangan menjadi gelap.")
    }
}