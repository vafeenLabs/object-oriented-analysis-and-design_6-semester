package lab4

import lab4.goblin.GoblinArmyFactory
import lab4.orc.OrcArmyFactory

/**
 * Паттерн: Абстрактная фабрика
 * Есть Гоблины и Орки
 * У каждого войска одинаковая иерархия: Генерал, Главнокомандующий, Солдаты
 * Реализовано создание войск и война
 */
fun main() {
    War(armyFactory1 = GoblinArmyFactory(), armyFactory2 = OrcArmyFactory()).go()
}