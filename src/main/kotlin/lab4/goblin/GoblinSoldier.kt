package lab4.goblin

import lab4.base.Soldier

class GoblinSoldier: Soldier {
    override fun toGo() {
        println("Гоблин-солдат: В атаку!")
    }

    override fun retreat() {
        println("Гоблин-солдат: Отступаем!")
    }
}