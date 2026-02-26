package OOP_108839_FarellTimothy.week02

class Loan(
    val bookTitle: String,
    val borrower: String,
    var loanDuration: Int = 1 // Spesifikasi 2: Default Argument = 1 hari
) {
    // Spesifikasi 3: Method untuk menghitung denda
    fun calculateFine(): Int {
        val fine: Int
        // Rumus: Jika durasi > 3 hari, denda = (Durasi - 3) * 2000
        if (loanDuration > 3) {
            fine = (loanDuration - 3) * 2000
        } else {
            // Jika durasi <= 3 hari, denda = 0
            fine = 0
        }
        return fine // Mengembalikan nilai Int (Total Denda)
    }
}