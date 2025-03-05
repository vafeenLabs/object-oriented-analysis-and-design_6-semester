package lab4.goblin

import lab4.base.ArmyGeneral

class GoblinGeneral : ArmyGeneral {
    override fun commandToCommanderInChiefToGo() {
        println("Гоблин-Генерал: Гоблины-Главнокомандующие, в атаку!")
    }

    override fun commandToCommanderInChiefRetreat() {
        println("Гоблин-Генерал: Гоблины-Главнокомандующие, отступаем!")
    }
}
