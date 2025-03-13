package lab5.modern

class ModernPaymentSystem {
    fun pay(iModernPaymentGateway: IModernPaymentGateway, amount: Float, currency: Currency) {
        iModernPaymentGateway.pay(amount, currency)
    }
}