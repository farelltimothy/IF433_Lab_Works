package oop_108839_FarellTimothy.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    val btc = Coin("BTC", 0.5)
    val eth = Coin("ETH", 10.0)
    val usdt = Coin("USDT", 5000.0)

    coinRepo.add(btc)
    coinRepo.add(eth)
    coinRepo.add(usdt)

    val allCoins = coinRepo.getAll()
    val response = ApiResponse("Success", allCoins)

    println("=== CRYPTO WALLET DASHBOARD ===")
    println("Status: ${response.status}")
    println("Daftar Aset Dompet:")
    response.data.forEach {
        println("- ${it.name}: ${it.balance}")
    }

    println("\n=== MENCARI ASET ===")
    val searchResult = coinRepo.searchByName("USDT")
    if (searchResult != null) {
        println("Aset ditemukan: $searchResult")
    } else {
        println("Aset tidak ditemukan.")
    }
}