package lab2

import java.io.File

abstract class FileProcessor {
    protected val contents = mutableListOf<String>()
    fun process(vararg fileName: String) {

        fileName.forEachIndexed { index, name ->
            val file = File(name)
            if (index < fileName.lastIndex) contents.add(file.readText())
        }
        val filew = File(fileName.last())
        filew.createNewFile()
        filew.writeText("")
        contents.forEach { content ->
            processFileContent(content)?.let {
                filew.appendText(it)
            }
        }
    }

    protected abstract fun processFileContent(content: String): String?
}