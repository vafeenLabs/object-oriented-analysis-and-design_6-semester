package lab4.goblin

import lab4.base.CommanderInChief

class GoblinCommanderInChief : CommanderInChief {
    override fun commandToSoldierToGo() {
        println("Гоблин-Главнокомандующий: Гоблины-солдаты, в атаку!")
    }

    override fun commandToSoldierRetreat() {
        println("Гоблин-Главнокомандующий: Гоблины-солдаты, отступаем!")
    }
}