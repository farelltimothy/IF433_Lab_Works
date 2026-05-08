package oop_108839_FarellTimothy.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 10.0))
    coinRepo.add(Coin("USDT", 5000.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("=== CRYPTO WALLET DASHBOARD ===")
    println("Status: ${response.status}")
    println("Daftar Aset:")

    response.data.forEach { coin ->
        println("Nama Koin: ${coin.name}, Saldo: ${coin.balance}")
    }
}