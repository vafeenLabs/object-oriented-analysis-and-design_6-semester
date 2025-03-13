package lab5.modern

interface IModernPaymentGateway {
    fun pay(amount: Float, currency: Currency)
}