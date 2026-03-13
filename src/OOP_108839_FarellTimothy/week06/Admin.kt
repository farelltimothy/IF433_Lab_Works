package oop_108839_FarellTimothy.week06

class Admin(nama: String) : Pegawai(nama) {

    override fun bekerja() {
        println("[$nama] sedang duduk di depan komputer melayani administrasi.")
    }

    fun doAdminWork() {
        println("[$nama] sedang merekap data absensi mahasiswa.")
    }
}