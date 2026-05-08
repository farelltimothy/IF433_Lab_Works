package oop_108839_FarellTimothy.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 10.0))
    coinRepo.add(Coin("USDT", 5000.0))

    // Simulasi Response Jaringan (Checkpoint 17)
    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("=== NETWORK RESPONSE SIMULATION ===")
    println("Status Code: ${response.status}")
    println("Payload Data:")
    response.data.forEach { coin ->
        println("-> Aset: ${coin.name}, Saldo: ${coin.balance}")
    }
}