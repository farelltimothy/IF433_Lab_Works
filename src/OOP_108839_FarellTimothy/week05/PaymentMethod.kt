package oop_108839_FarellTimothy.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}