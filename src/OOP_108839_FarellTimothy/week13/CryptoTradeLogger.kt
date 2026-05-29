package OOP_108839_FarellTimothy.week13

import java.io.File

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)