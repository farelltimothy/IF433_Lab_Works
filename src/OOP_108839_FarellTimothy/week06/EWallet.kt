package oop_108839_FarellTimothy.week06

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    // Override metode dari parent untuk memproses pembayaran
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName] Pembayaran via E-Wallet sebesar $amount berhasil. Sisa saldo: $balance")
        } else {
            println("[$accountName] Gagal membayar. Saldo tidak cukup.")
        }
    }

    // Fungsi spesifik hanya untuk EWallet
    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName] Berhasil top up sebesar $amount. Saldo sekarang: $balance")
    }
}