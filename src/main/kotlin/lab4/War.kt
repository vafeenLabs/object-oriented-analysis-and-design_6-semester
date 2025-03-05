package lab4

import lab4.base.ArmyFactory
import lab4.base.ArmyGeneral
import lab4.base.CommanderInChief
import lab4.base.Soldier

class War(
    private val armyFactory1: ArmyFactory,
    private val armyFactory2: ArmyFactory
) {
    lateinit var armyGeneral1: ArmyGeneral
    lateinit var armyGeneral2: ArmyGeneral
    lateinit var armyCommanderInChief1: CommanderInChief
    lateinit var armyCommanderInChief2: CommanderInChief
    lateinit var armySoldiers1: List<Soldier>
    lateinit var armySoldiers2: List<Soldier>
    private fun createArmy1() {
        armyGeneral1 = armyFactory1.createGeneral()
        armyCommanderInChief1 = armyFactory1.createCommanderInChief()
        armySoldiers1 = armyFactory1.createSoldiers()
    }

    private fun createArmy2() {
        armyGeneral2 = armyFactory2.createGeneral()
        armyCommanderInChief2 = armyFactory2.createCommanderInChief()
        armySoldiers2 = armyFactory2.createSoldiers()
    }

    fun go() {
        println("\nСоздание первой армии")
        createArmy1()
        println("\nСоздание второй армии")
        createArmy2()

        println("\nНачало войны")
        armyGeneral1.commandToCommanderInChiefToGo()
        armyCommanderInChief1.commandToSoldierToGo()
        armySoldiers1.forEach { it.toGo() }

        armyGeneral2.commandToCommanderInChiefRetreat()
        armyCommanderInChief2.commandToSoldierRetreat()
        armySoldiers2.forEach { it.retreat() }
        println("\nВойна окончена")
    }
}