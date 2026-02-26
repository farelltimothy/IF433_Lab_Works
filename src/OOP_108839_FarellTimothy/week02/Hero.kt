package OOP_108839_FarellTimothy.week02

class Hero(
    val name: String,           // Properti nama
    var baseDamage: Int,        // Properti damage
    var hp: Int = 100           // Default Argument HP = 100
) {
    // Method untuk simulasi serangan
    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    // Method untuk menerima damage
    fun takeDamage(damage: Int) {
        hp -= damage
        // Logika Wajib: HP tidak boleh minus (minimal 0)
        if (hp < 0) {
            hp = 0
        }
        println("$name menerima $damage damage! Sisa HP: $hp")
    }

    // Method untuk cek status hidup
    fun isAlive(): Boolean {
        return hp > 0
    }
}