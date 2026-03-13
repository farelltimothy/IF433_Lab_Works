package oop_108839_FarellTimothy.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("[$accountName] Pembayaran via Credit Card sebesar $amount berhasil. Total tagihan: $usedAmount")
        } else {
            println("[$accountName] Transaksi ditolak. Melebihi limit kartu kredit.")
        }
    }
}