package oop_108839_FarellTimothy.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 600000
    // Lanjut ke langkah berikutnya...

    val discountPercent = calculateDiscount(price)
    val finalPrice = price - (price * discountPercent / 100)

    printReceipt(title = gameTitle, finalPrice = finalPrice)

    // Di luar main() tambahkan:
    fun printReceipt(title: String, finalPrice: Int) {
        println("=== STRUK PEMBELIAN STEAMKW ===")
        println("Game: $title")
        println("Harga Akhir: Rp $finalPrice")
}

fun calculateDiscount(price: Int) = if (price > 500000) 20 else 10