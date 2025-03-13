package lab5.modern

object CurrencyConverter {
    private const val DOLLAR_PRICE = 75
    private const val EURO_PRICE = 80
    fun convert(oldCurrency: Currency, newCurrency: Currency, amount: Float): Float {
        val newAmountInRubles = when (oldCurrency) {
            Currency.RUB -> amount
            Currency.EURO -> EURO_PRICE * amount
            Currency.DOLLAR -> DOLLAR_PRICE * amount
        }
        val newAmountInCurrency = when (newCurrency) {
            Currency.RUB -> newAmountInRubles
            Currency.EURO -> newAmountInRubles / EURO_PRICE
            Currency.DOLLAR -> newAmountInRubles / DOLLAR_PRICE
        }
        return newAmountInCurrency
    }

}