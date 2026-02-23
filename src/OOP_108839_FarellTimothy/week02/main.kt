package oop_108839_farelltimothy.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()
    scanner.nextLine() // Bersihkan buffer newline [cite: 41, 42]

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!") [cite: 42]
    } else {
        // Langkah 6: Menu Pilihan Jalur [cite: 70, 71]
        print("Pilih Jalur (1. Reguler, 2. Umum): ")
        val type = scanner.nextInt()
        scanner.nextLine() // Consume newline [cite: 75, 76]

        if (type == 1) {
            print("Masukkan Jurusan: ")
            val major = scanner.nextLine()

            // Memanggil Primary Constructor [cite: 81]
            val s1 = Student(name, nim, major)
            println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}") [cite: 84]

        } else if (type == 2) {
            // Memanggil Secondary Constructor (Jurusan otomatis "Non-Matriculated") [cite: 86]
            val s2 = Student(name, nim)
            println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}") [cite: 87]

        } else {
            println("Pilihan ngawur, pendaftaran batal!") [cite: 90]
        }
    }
        println("\n--- SYSTEM PEMINJAMAN BUKU ---")
        print("Judul Buku: ")
        val title = scanner.nextLine() // scanner sudah didefinisikan sebelumnya

        print("Nama Peminjam: ")
        val borrowerName = scanner.nextLine()

        print("Lama Pinjam (Hari): ")
        var duration = scanner.nextInt()
        scanner.nextLine() // Clear buffer

// Validasi: Lama pinjam tidak boleh minus [cite: 115]
        if (duration < 0) {
        duration = 1 // Jika minus, otomatis ubah menjadi 1 hari [cite: 116]
        println("LOG: Durasi tidak valid, diset ke 1 hari.")
    }

// Membuat objek Loan [cite: 117]
        val myLoan = Loan(title, borrowerName, duration)

// Print detail dan total denda [cite: 117]
        println("Buku: ${myLoan.bookTitle} | Peminjam: ${myLoan.borrower}")
        println("Total Denda: Rp ${myLoan.calculateFine()}")
}