package oop_108839_FarellTimothy.week07

class Weapon private constructor(val item: GameItem, val durability: Int)

class WeaponForge {
    companion object {
        fun forgeStarterSword(): Weapon {
            val starterItem = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            return Weapon(starterItem, 50)
        }

        fun forgeEpicSword(): Weapon {
            val epicItem = GameItem("Excalibur", 999, ItemRarity.EPIC)
            return Weapon(epicItem, 200)
        }
    }
}