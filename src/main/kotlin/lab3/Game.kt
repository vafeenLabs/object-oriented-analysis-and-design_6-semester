package lab3

// Client
class Game(username1: String, userName2: String) {
    private val player1 = Player(username1, "X")
    private val player2 = Player(userName2, "O")
    private var isStarted = false
    private val invoker = Invoker()
    private val table = TicTacToeTable()
    private var currentUser = player1
    private fun changeUser() {
        currentUser = if (currentUser == player1) player2 else player1
    }

    private fun beforeMove() {
        println("\n\n\n")
        println(table)
        println("Ходит ${currentUser.username}")
    }

    private fun enterMove() {
        var entering = true
        while (entering) {
            println("Введите ход: `Строкуа` `Cтолбец`\nИли отмену хода с помощью `${invoker.strCommandUndoLastCommand}`\n>")
            val enteredSymbols = readln().trim().split(" ")
            when {
                enteredSymbols.size == 2 -> {
                    invoker.addCommand(
                        PlayCommand(
                            table = table,
                            indexX = enteredSymbols[0].toInt(),
                            indexY = enteredSymbols[1].toInt(),
                            icon = currentUser.icon
                        )
                    )
                    entering = false
                }

                enteredSymbols.size == 1 && enteredSymbols[0] == invoker.strCommandUndoLastCommand -> {
                    invoker.popBackLastCommand()
                    entering = false
                }

                else -> {
                    println("Неверный ввод")
                }
            }
        }
    }

    private fun afterMove() {
        if (gameCanContinue()) changeUser() else {
            isStarted = false
            println(table)
            println("Выиграл ${currentUser.username}")
        }
    }

    private fun gameCanContinue(): Boolean = TicTacToeTable.allParts.all { !table.checkSameSymbolsOn(it) }


    fun start() {
        if (isStarted) return
        isStarted = true
        while (isStarted) {
            beforeMove()
            enterMove()
            afterMove()
        }
    }

    companion object {
        class Player(val username: String, val icon: String)
    }
}