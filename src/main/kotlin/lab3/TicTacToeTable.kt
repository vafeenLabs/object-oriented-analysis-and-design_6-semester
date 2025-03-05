package lab3


// Receiver
class TicTacToeTable {
    private val table = MutableList(3) { MutableList(3) { EMPTY_SYMBOL } }
    operator fun get(indexX: Int, indexY: Int) = table[indexX][indexY]
    operator fun set(indexX: Int, indexY: Int, value: String) {
        table[indexX][indexY] = value
    }

    override fun toString(): String = table.joinToString(separator = "") { row ->
            "${row.joinToString(separator = "") { cell -> " $cell " }}\n"
    }

    fun checkSameSymbolsOn(partTable: PartTable): Boolean {
        return when (partTable) {
            is PartTable.Row -> {
                val row = table[partTable.number]
                row[0] == row[1] && row[1] == row[2] && row[2] != EMPTY_SYMBOL
            }

            is PartTable.Column -> {
                table[0][partTable.number] == table[1][partTable.number] &&
                        table[1][partTable.number] == table[2][partTable.number]
                        && table[0][partTable.number] != EMPTY_SYMBOL
            }

            is PartTable.MainDiagonal -> {
                table[0][0] == table[1][1] && table[1][1] == table[2][2] && table[0][0] != EMPTY_SYMBOL
            }

            PartTable.SideDiagonal -> {
                table[2][0] == table[1][1] && table[1][1] == table[0][2] && table[2][0] != EMPTY_SYMBOL
            }
        }
    }

    companion object {
        const val EMPTY_SYMBOL = "_"

        sealed class PartTable {
            class Row(val number: Int) : PartTable()
            class Column(val number: Int) : PartTable()
            data object MainDiagonal : PartTable()
            data object SideDiagonal : PartTable()
        }

        val allParts = listOf(
            PartTable.Row(0),
            PartTable.Row(1),
            PartTable.Row(2),
            PartTable.Column(0),
            PartTable.Column(1),
            PartTable.Column(2),
            PartTable.MainDiagonal,
            PartTable.SideDiagonal
        )
    }
}
