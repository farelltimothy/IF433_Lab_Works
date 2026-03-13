package oop_108839_FarellTimothy.week06

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("[$name - $id]: Speaker aktif. Menunggu perintah suara...")
    }

    override fun turnOff() {
        println("[$name - $id]: Speaker nonaktif. Sampai jumpa!")
    }

    fun playMusic(song: String) {
        println("[$name]: Memutar lagu $song dari Spotify.")
    }
}