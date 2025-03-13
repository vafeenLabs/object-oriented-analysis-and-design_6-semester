package lab5.old_systems

import lab5.modern.Currency

class OldDollarPaymentSystem {
    fun payInDollar(amount: Float) {
        println("Покупка оплачена: $amount ${Currency.DOLLAR}")
    }
}