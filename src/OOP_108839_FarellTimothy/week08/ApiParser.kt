package OOP_108839_FarellTimothy.week08

class ApiParser {
    fun parseProduct(data: Map<String, Any?>): Product? {
        val type = data["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                val id = data["id"] as? String ?: "UNKNOWN_ID"
                val name = data["name"] as? String ?: "No Name"
                val warranty = data["warranty"] as? Int ?: 0
                Electronic(id, name, warranty)
            }
            "CLOTHING" -> {
                val id = data["id"] as? String ?: "UNKNOWN_ID"
                val name = data["name"] as? String ?: "No Name"
                val size = data["size"] as? String ?: "All Size"
                Clothing(id, name, size)
            }
            else -> null
        }
    }
}