package lab4

import lab4.goblin.GoblinArmyFactory
import lab4.orc.OrcArmyFactory

fun main() {
    War(armyFactory1 = GoblinArmyFactory(), armyFactory2 = OrcArmyFactory()).go()
}