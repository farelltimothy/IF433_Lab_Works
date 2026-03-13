package oop_108839_FarellTimothy.week06

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}