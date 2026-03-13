package oop_108839_FarellTimothy.week06

class Dosen(nama: String, val nidn: String) : Pegawai(nama) {

    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan merevisi RPKPS.")
    }

    fun mengajar() {
        println("[$nama] sedang mengajar mahasiswa di kelas.")
    }
}