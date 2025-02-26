package lab2

class FindFileWithWordsFromFirstFile : FileProcessor() {
    override fun processFileContent(content: String): String? {

        val wordsFromFirstContent = contents[0].split("\\s+".toRegex())
        val foundWords = content.split("\\s+".toRegex())
            .filter { word -> wordsFromFirstContent.contains(word) }

        return if (foundWords.isNotEmpty()) {
            foundWords.joinToString(separator = ", ")
        } else {
            null
        }
    }
}