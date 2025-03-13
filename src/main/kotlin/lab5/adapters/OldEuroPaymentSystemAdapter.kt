package lab5.adapters

import lab5.modern.Currency
import lab5.modern.CurrencyConverter
import lab5.modern.IModernPaymentGateway
import lab5.old_systems.OldDollarPaymentSystem
import lab5.old_systems.OldEuroPaymentSystem

class OldEuroPaymentSystemAdapter(private val oldEuroPaymentSystem: OldEuroPaymentSystem) : IModernPaymentGateway {
    override fun pay(amount: Float, currency: Currency) {
        val newAmountInEuro = CurrencyConverter.convert(currency, Currency.EURO, amount)
        println("$amount $currency converted into $newAmountInEuro ${Currency.EURO}")
        oldEuroPaymentSystem.payInEuro(newAmountInEuro)
    }
}