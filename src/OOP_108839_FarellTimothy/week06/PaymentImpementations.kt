package oop_108839_FarellTimothy.week06

class Gopay : PaymentMethod {
    override fun pay(amount: Double) {
        println("Processing Rp$amount via Gopay Server")
    }
}

class CreditCardPayment : PaymentMethod {
    // Saya beri nama CreditCardPayment supaya tidak bentrok dengan class CreditCard lama kamu
    override fun pay(amount: Double) {
        println("Contacting Bank for Rp$amount")
    }
}