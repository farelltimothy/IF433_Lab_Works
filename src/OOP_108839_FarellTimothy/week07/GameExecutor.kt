package oop_108839_FarellTimothy.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Waspada! Kamu bertemu dengan ${event.monsterName}!")
        }
        is BattleState.LootDropped -> {
            // Menggunakan Smart Cast untuk mengakses properti dari GameItem
            val item = event.item
            println("Hoki! Kamu mendapat loot: ${item.name} [${item.rarity}] dengan damage ${item.damage}")
        }
        is BattleState.GameOver -> {
            println("Game Over! Alasan: ${event.reason}")
        }
        BattleState.SafeZone -> {
            println("Kamu berada di zona aman. Silakan beristirahat.")
        }
    }
}