package lab5.adapters

import lab5.modern.Currency
import lab5.modern.CurrencyConverter
import lab5.modern.IModernPaymentGateway
import lab5.old_systems.OldDollarPaymentSystem

class OldDollarPaymentSystemAdapter(private val oldDollarPaymentSystem: OldDollarPaymentSystem) :
    IModernPaymentGateway {
    override fun pay(amount: Float, currency: Currency) {
        val newAmountInDollar = CurrencyConverter.convert(currency, Currency.DOLLAR, amount)
        println("$amount $currency converted into $newAmountInDollar ${Currency.DOLLAR}")
        oldDollarPaymentSystem.payInDollar(newAmountInDollar)
    }

}