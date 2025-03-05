package lab3

import java.util.Stack

// Invoker
class Invoker {
    private val stack = Stack<Command>()
    val strCommandUndoLastCommand = "u"
    fun addCommand(command: Command) {
        command.execute()
        stack.add(command)
    }

    fun popBackLastCommand() {
        if (stack.isNotEmpty()) {
            val lastCommand: Command = stack.pop()
            lastCommand.undo()
        } else {
            println("Еще не было команд")
        }
    }
}