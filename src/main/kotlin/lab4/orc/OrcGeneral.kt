package lab4.orc

import lab4.base.ArmyGeneral

class OrcGeneral : ArmyGeneral{
    override fun commandToCommanderInChiefToGo() {
        println("Генерал: Орки-Главнокомандующие, в атаку!")
    }

    override fun commandToCommanderInChiefRetreat() {
        println("Генерал: Орки-Главнокомандующие, отступаем!")
    }
}
