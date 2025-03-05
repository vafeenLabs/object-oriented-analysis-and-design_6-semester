package lab4.orc

import lab4.base.ArmyFactory
import lab4.base.ArmyGeneral
import lab4.base.CommanderInChief
import lab4.base.Soldier
import lab4.goblin.GoblinCommanderInChief
import lab4.goblin.GoblinGeneral
import lab4.goblin.GoblinSoldier

class OrcArmyFactory : ArmyFactory {
    override fun createCommanderInChief(): CommanderInChief {
        println("Создан главнокомандующий орков")
        return OrcCommanderInChief()
    }

    override fun createGeneral(): ArmyGeneral {
        println("Создан генерал орков")
        return OrcGeneral()
    }

    override fun createSoldiers(): List<Soldier> {
        println("Создана группа солдатов орков")
        return listOf(OrcSoldier())
    }
}