package OOP_108839_FarellTimothy.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine() // Bersihkan buffer newline

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        print("Pilih Jalur (1. Reguler, 2. Umum): ")
        val type = scanner.nextInt()
        scanner.nextLine() // Consume newline

        if (type == 1) {
            print("Masukkan Jurusan: ")
            val major = scanner.nextLine()

            // Memanggil Primary Constructor
            val s1 = Student(name, nim, major)
            println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
            println("Status: Pendaftaran Selesai.")

        } else if (type == 2) {
            // Memanggil Secondary Constructor (Jurusan otomatis "Non-Matriculated")
            val s2 = Student(name, nim)
            println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
            println("Status: Pendaftaran Selesai.")

        } else {
            println("Pilihan ngawur, pendaftaran batal!")
        }
    }

    val pinjaman1 = Loan("Kotlin for Beginners", "Farell", 5)
    println("Buku: ${pinjaman1.bookTitle}, Denda: Rp${pinjaman1.calculateFine()}")

    println("\n--- SISTEM PERPUSTAKAAN ---")

    print("Masukkan Judul Buku: ")
    val bookTitle = scanner.nextLine() // Mengambil input judul

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine() // Mengambil input peminjam

    print("Masukkan Lama Pinjam (Hari): ")
    var durationInput = scanner.nextInt() // Mengambil input durasi
    scanner.nextLine() // Bersihkan buffer newline

    // Validasi: Lama pinjam tidak boleh minus
    if (durationInput < 0) {
        println("INFO: Lama pinjam tidak valid. Otomatis diatur ke 1 hari.")
        durationInput = 1 // Otomatis ubah menjadi 1 hari
    }

    // Buat objek Loan
    val pinjamanBaru = Loan(bookTitle, borrower, durationInput)

    // Print detail peminjaman dan Total Dendanya
    println("\n--- DETAIL PEMINJAMAN ---")
    println("Peminjam: ${pinjamanBaru.borrower}")
    println("Buku    : ${pinjamanBaru.bookTitle}")
    println("Durasi  : ${pinjamanBaru.loanDuration} hari")
    println("Denda   : Rp${pinjamanBaru.calculateFine()}")
}