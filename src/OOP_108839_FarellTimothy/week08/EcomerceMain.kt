package OOP_108839_FarellTimothy.week08

fun main() {
    val parser = ApiParser()

    // Data mentah campuran (Simulasi JSON kotor)
    val rawRemoteData: List<Map<String, Any?>> = listOf(
        mapOf("type" to "ELECTRONIC", "id" to "LPT-01", "name" to "Laptop", "warranty" to 24),
        mapOf("type" to "CLOTHING", "id" to "TSH-02", "name" to "T-Shirt", "size" to "XL"),
        mapOf("type" to "ELECTRONIC", "id" to "MOU-03", "name" to "Mouse"), // Tanpa warranty (fallback ke 12 di test case)
        mapOf("type" to "GHOST_ITEM"), // Data tidak lengkap
        mapOf("type" to "FOOD", "name" to "Bread") // Tipe tidak didukung
    )

    println("=== STARTING E-COMMERCE PIPELINE ===")

    for (rawData in rawRemoteData) {
        // Checkpoint 19: Mencoba parsing data menggunakan safe casting
        val product = parser.parseProduct(rawData)

        product?.let {
            println("Processing: ${it::class.simpleName} - ID: ${rawData["id"]}")
            parser.checkout(it)
        } ?: println("Skipping item: Data tidak valid atau tipe tidak didukung.")
    }
}