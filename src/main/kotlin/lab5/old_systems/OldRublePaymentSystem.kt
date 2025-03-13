package lab5.old_systems

import lab5.modern.Currency

class OldRublePaymentSystem {
    fun payInRubles(amount: Float) {
        println("Покупка оплачена: $amount ${Currency.RUB}")
    }
}