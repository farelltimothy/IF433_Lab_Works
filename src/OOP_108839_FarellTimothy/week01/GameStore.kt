package oop_108839_FarellTimothy.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 600000
    val userNote: String? = null

    val discountPercent = calculateDiscount(price)
    val finalPrice = price - (price * discountPercent / 100)

    // Pemanggilan fungsi dengan Named Arguments
    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        note = userNote
    )
}
fun calculateDiscount(price: Int) = if (price > 500000) 20
else 10

fun printReceipt(title: String, finalPrice: Int, note: String?) {
    println("=== STRUK PEMBELIAN STEAMKW ===")
    println("Game: $title")
    println("Harga Akhir: Rp $finalPrice")
    // Menggunakan Elvis Operator (?:) sesuai instruksi modul
    println("Catatan: ${note ?: "Tidak ada catatan"}")