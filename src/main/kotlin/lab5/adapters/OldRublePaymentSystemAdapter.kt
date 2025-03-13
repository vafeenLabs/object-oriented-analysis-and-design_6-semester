package lab5.adapters

import lab5.modern.Currency
import lab5.modern.CurrencyConverter
import lab5.modern.IModernPaymentGateway
import lab5.old_systems.OldRublePaymentSystem

class OldRublePaymentSystemAdapter(private val oldRublePaymentSystem: OldRublePaymentSystem) : IModernPaymentGateway {
    override fun pay(amount: Float, currency: Currency) {
        val newAmountInRubles = CurrencyConverter.convert(currency, Currency.RUB, amount)
        println("$amount $currency converted into $newAmountInRubles ${Currency.RUB}")
        oldRublePaymentSystem.payInRubles(newAmountInRubles)
    }

}