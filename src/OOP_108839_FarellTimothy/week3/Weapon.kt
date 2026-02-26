package OOP_108839_FarellTimothy.week3

class Weapon(val name: String) {

    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Damage tidak boleh negatif! Nilai tetap: $field")
            } else if (value > 1000) {

                println("WARNING: Weapon Overpowered! Damage dipaksa ke 1000.")
                field = 1000
            } else {
                field = value
            }
        }

    val tier: String
        get() {
            return when {
                damage > 800 -> "Legendary"
                damage > 500 -> "Epic"
                else -> "Common"
            }
        }
}