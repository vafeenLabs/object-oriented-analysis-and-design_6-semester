package lab4.orc

import lab4.base.Soldier

class OrcSoldier : Soldier {
    override fun toGo() {
        println("Орк-Солдат: В атаку!")
    }

    override fun retreat() {
        println("Орк-Солдат: Отступаем!")
    }
}