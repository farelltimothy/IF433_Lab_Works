package oop_108839_FarellTimothy.week06

fun main() {
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar() // Smart cast! Tidak perlu manual casting (as)
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("------------------------------")

        println("\n=== PENGUJIAN MATHHELPER (OVERLOADING) ===")
        val mathHelper = MathHelper()

        val luasPersegi = mathHelper.hitungLuas(5)
        println("Luas Persegi (sisi 5): $luasPersegi")

        val luasPersegiPanjang = mathHelper.hitungLuas(10, 5)
        println("Luas Persegi Panjang (10x5): $luasPersegiPanjang")

        val luasLingkaran = mathHelper.hitungLuas(7.0)
        println("Luas Lingkaran (jari-jari 7.0): $luasLingkaran")
        }
    }
