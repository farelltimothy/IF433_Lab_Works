package OOP_108839_FarellTimothy.week3

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            println("Mencoba set gaji ke: $value")
            // PERINGATAN: KODE DI BAWAH INI SALAH & BERBAHAYA!
            // Memanggil setter di dalam setter itu sendiri (Recursive)
            this.salary = value
        }
}