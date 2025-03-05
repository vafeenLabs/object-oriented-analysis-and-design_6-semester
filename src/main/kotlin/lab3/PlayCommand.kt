package lab3

// Concrete command
class PlayCommand(
    private val table: TicTacToeTable,
    private val indexX: Int,
    private val indexY: Int,
    private val icon: String
) : Command {
    override fun execute() {
        table[indexX, indexY] = icon
    }

    override fun undo() {
        table[indexX, indexY] = TicTacToeTable.EMPTY_SYMBOL
    }
}