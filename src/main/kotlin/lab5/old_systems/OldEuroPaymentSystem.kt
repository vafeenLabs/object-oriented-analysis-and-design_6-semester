package lab5.old_systems

import lab5.modern.Currency

class OldEuroPaymentSystem {
    fun payInEuro(amount: Float) {
        println("Покупка оплачена: $amount ${Currency.EURO}")
    }
}