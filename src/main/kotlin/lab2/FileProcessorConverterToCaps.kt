package lab2

import java.util.*

class FileProcessorConverterToCaps : FileProcessor() {
    override fun processFileContent(content: String): String? = content.uppercase(Locale.getDefault())
}