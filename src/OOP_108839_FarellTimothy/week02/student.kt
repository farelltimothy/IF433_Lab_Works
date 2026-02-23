package oop_108839_farelltimothy.week02

class Student (
    val name: String,
    val nim: String,
    var major: String,
    var gpa: Double = 0.0
) {
    init {
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
        } else {
            println("LOG: Objek Student $name berhasil dibuat.")
        }
    }
}

constructor (name: String, nim: String): this (name, nim, "Non-Matriculated") {
    println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
}