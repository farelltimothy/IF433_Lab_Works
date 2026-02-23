package oop_108839_farelltimothy.week02

class Loan(
    val bookTitle: String,
    val borrower: String,
    var loanDuration: Int = 1 // Default Argument: 1 hari
) {
    // Method untuk menghitung denda
    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            // Jika durasi > 3 hari, denda = (Durasi - 3) * Rp 2.000
            (loanDuration - 3) * 2000
        } else {
            // Jika durasi <= 3 hari, denda = 0
            0
        }
    }
}