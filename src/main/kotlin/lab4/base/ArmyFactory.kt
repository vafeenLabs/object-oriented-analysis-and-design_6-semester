package lab4.base

import lab4.base.ArmyGeneral
import lab4.base.CommanderInChief
import lab4.base.Soldier

interface ArmyFactory {
    fun createCommanderInChief(): CommanderInChief
    fun createGeneral(): ArmyGeneral
    fun createSoldiers(): List<Soldier>
}