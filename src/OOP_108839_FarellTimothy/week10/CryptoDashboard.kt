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

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX1001", 0.05))
    txRepo.add(Transaction("TX1002", 1.2))
    txRepo.add(Transaction("TX1003", 500.0))

    val txResponse = ApiResponse("200 OK", txRepo.getAll())

    println("\n=== TRANSACTION HISTORY ===")
    println("Status: ${txResponse.status}")
    txResponse.data.forEach { tx ->
        println("ID Transaksi: ${tx.id}, Jumlah: ${tx.amount}")
    }
}