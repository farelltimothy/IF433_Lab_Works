package oop_108839_FarellTimothy.week10

class WalletRepository<T : Any> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun searchByName(name: String): T? {
        return items.find { item ->
            when (item) {
                is Coin -> item.name.equals(name, ignoreCase = true)
                else -> false
            }
        }
    }
}