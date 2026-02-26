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

    println("\n--- WELCOME TO THE ARENA ---")

    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage Hero: ")
    val heroDamage = scanner.nextInt()

    // 1. Buat Objek Hero
    val myHero = Hero(heroName, heroDamage)

    // 2. Variabel bantuan untuk musuh
    var enemyHp = 100
    val enemyName = "Gorgon"

    println("\n$heroName VS $enemyName DIMULAI!")

    // 3. Main Loop: Selama Hero hidup DAN musuh hidup
    while (myHero.isAlive() && enemyHp > 0) {
        println("\n--- MENU AKSI ---")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih aksi: ")

        when (scanner.nextInt()) {
            1 -> {
                // Hero menyerang musuh
                myHero.attack(enemyName)
                enemyHp -= myHero.baseDamage
                if (enemyHp < 0) enemyHp = 0
                println("HP $enemyName sisa: $enemyHp")

                // Jika musuh belum mati, musuh membalas
                if (enemyHp > 0) {
                    val randomDamage = (10..20).random() // Damage acak 10-20
                    myHero.takeDamage(randomDamage)
                }
            }
            2 -> {
                println("Anda memilih kabur dari pertarungan!")
                break // Paksa loop berhenti
            }
            else -> println("Pilihan tidak valid!")
        }
    }

    // 4. Pengumuman pemenang
    println("\n--- PERTARUNGAN BERAKHIR ---")
    if (myHero.isAlive() && enemyHp <= 0) {
        println("SELAMAT! ${myHero.name} menang mutlak!")
    } else if (!myHero.isAlive()) {
        println("GAME OVER! ${myHero.name} telah gugur di medan perang.")
    } else {
        println("Pertarungan berakhir tanpa pemenang (Anda Kabur).")
    }
}