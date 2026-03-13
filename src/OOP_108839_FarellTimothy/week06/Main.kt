package oop_108839_FarellTimothy.week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCardPayment()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)

    println("\n=== SMART HOME SYSTEM STARTING ===")

    // 1. Instansiasi Perangkat (Checkpoint 19)
    val lampuTamu = SmartLamp("L01", "Ruang Tamu")
    val speakerDapur = SmartSpeaker("S01", "Google Nest Dapur")
    val cctvGarasi = SmartCCTV("C01", "Ezviz Garasi")
}