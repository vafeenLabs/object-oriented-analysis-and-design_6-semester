package lab5

import lab5.adapters.OldDollarPaymentSystemAdapter
import lab5.adapters.OldEuroPaymentSystemAdapter
import lab5.adapters.OldRublePaymentSystemAdapter
import lab5.modern.Currency
import lab5.modern.ModernPaymentSystem
import lab5.old_systems.OldDollarPaymentSystem
import lab5.old_systems.OldEuroPaymentSystem
import lab5.old_systems.OldRublePaymentSystem

/**
 *Описание задачи: Вам нужно разработать систему,
 * которая поддерживает обработку платежей
 * в разных валютах (рубли, доллары, евро)
 * через несколько старых платежных систем.
 * Каждая старая система работает только с одной валютой,
 * но клиентский код должен уметь работать с любой валютой через единый интерфейс.
 * Требования:
 * 1.	Реализовать три старые платежные системы.
 * 2.	Создать интерфейс IModernPaymentGateway
 * с методом Pay(float amount, string currency),
 * где currency — это код валюты ("RUB", "USD", "EUR").
 * 3.	Реализовать адаптеры для каждой старой системы.
 * 4.	Добавить поддержку конвертации валют.
 * Если клиентский код передает платеж в валюте,
 * которую старая система не поддерживает,
 * адаптер должен конвертировать сумму в нужную валюту
 * (используйте фиксированные курсы для простоты).
 */
fun main() {
    println("\nНачало платежей\n")
    val paymentSystem = ModernPaymentSystem()

    val oldDollarPaymentSystem = OldDollarPaymentSystem()
    val oldEuroPaymentSystem = OldEuroPaymentSystem()
    val oldRublePaymentSystem = OldRublePaymentSystem()

    val dollarAdapter = OldDollarPaymentSystemAdapter(oldDollarPaymentSystem)
    val euroAdapter = OldEuroPaymentSystemAdapter(oldEuroPaymentSystem)
    val rubleAdapter = OldRublePaymentSystemAdapter(oldRublePaymentSystem)

    paymentSystem.pay(dollarAdapter, 100f, Currency.RUB)
    paymentSystem.pay(euroAdapter, 500f, Currency.DOLLAR)
    paymentSystem.pay(rubleAdapter, 1000f, Currency.EURO)
}