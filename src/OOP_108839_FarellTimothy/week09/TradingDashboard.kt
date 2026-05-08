package OOP_108839_FarellTimothy.week09

fun main() {
    // Inisialisasi Data Uji (Minimal 6 TradeLog)
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 10, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 5, -10.0, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 20, 50.0, "OPEN"),
        TradeLog("SOLUSDT", "LONG", 10, -5.5, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 15, 25.0, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 10, -12.0, "CLOSED")
    )

    println("=== Crypto Trading Dashboard ===")
    println("Total Logs: ${tradeHistory.size}")

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }

    val winningTrades = closedTrades.filter { it.roe > 0 }

    val losingTrades = closedTrades.filter { it.roe <= 0 }

    // Print untuk verifikasi hasil
    println("--- Statistics ---")
    println("Closed Trades: ${closedTrades.size}")
    println("Winning Trades: ${winningTrades.size}")
    println("Losing Trades: ${losingTrades.size}")
}