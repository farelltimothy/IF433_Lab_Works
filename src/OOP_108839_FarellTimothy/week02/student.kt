package oop_108839_farelltimothy.week02

class Student (
    val name: String,
    val nim: String,
    var major: String
) {
    init {
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
        } else {
            println("LOG: Objek Student $name berhasil dibuat.")
        }
    }
}