package lab4.goblin

import lab4.base.ArmyFactory
import lab4.base.ArmyGeneral
import lab4.base.CommanderInChief
import lab4.base.Soldier

class GoblinArmyFactory : ArmyFactory {
    override fun createCommanderInChief(): CommanderInChief {
        println("Создан главнокомандующий гоблинов")
        return GoblinCommanderInChief()
    }

    override fun createGeneral(): ArmyGeneral {
        println("Создан генерал гоблинов")
        return GoblinGeneral()
    }

    override fun createSoldiers(): List<Soldier> {
        println("Создана группа солдатов гоблинов")
        return listOf(GoblinSoldier())
    }
}