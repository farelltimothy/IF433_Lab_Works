package oop_108839_FarellTimothy.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    val btc = Coin("Bitcoin", 0.5)
    val eth = Coin("Ethereum", 10.0)

    coinRepo.add(btc)
    coinRepo.add(eth)

    val allCoins = coinRepo.getAll()
    val response = ApiResponse("Success", allCoins)

    println("=== CRYPTO WALLET DASHBOARD ===")
    println("Status: ${response.status}")
    println("Daftar Koin:")
    response.data.forEach {
        println("- ${it.name}: ${it.balance} BTC/ETH")
    }

    val searchResult = coinRepo.searchByName("Bitcoin")
    println("\nHasil Pencarian 'Bitcoin': $searchResult")
}