package oop_108839_FarellTimothy.week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)

    println(reg1)
    println("Sama? ${reg1 == reg2}")

    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)

    println(data1)
    println("Sama? ${data1 == data2}")

    println("\n=== TEST COPY & DESTRUCTURING ===")

    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")

    val (userName, userAge) = data1
    println("Destructured: $userName berumur $userAge")

    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")

    // ERROR: 'when' expression must be exhaustive (kurang state Loading)
    val uiMessage = when(response) {
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
        ApiResponse.Loading -> "Tampilkan Spinner"
    }

    println(uiMessage)

    println("\n=== TEST RPG GAME MANAGER (SINGLETON) ===")

    GameManager.startGame()
    GameManager.startGame()

    println("\n=== TEST RARITY & FACTORY ===")

    // 1. Cetak nilai drop chance dari Enum
    println("Drop chance Legendary: ${ItemRarity.LEGENDARY.dropChance}%")

    // 2. Gunakan factory untuk membuat senjata awal
    val startingWeapon = Weapon.forgeStarterSword()

    // 3. Cetak detail senjatanya
    println("Senjata Baru: ${startingWeapon.item.name}")
    println("Rarity: ${startingWeapon.item.rarity}")
    println("Damage: ${startingWeapon.item.damage}")
    println("Durability: ${startingWeapon.durability}")

    println("\n=== TEST DATA CLASS COPY & EVENT DISPATCH ===")

    val upgradedItem = startingWeapon.item.copy(damage = 25)
    println("Senjata setelah upgrade: ${upgradedItem.name} dengan damage baru: ${upgradedItem.damage}")

    println("\n--- Memulai Petualangan ---")
    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedItem))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}



