package lab4.orc

import lab4.base.CommanderInChief

class OrcCommanderInChief : CommanderInChief{
    override fun commandToSoldierToGo() {
        println("Главнокомандующий: Орки-солдаты, в атаку!")
    }

    override fun commandToSoldierRetreat() {
        println("Главнокомандующий: Орки-солдаты, отступаем!")
    }
}