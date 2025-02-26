package lab1

import java.io.File

/** ТЗ
 * Стратегия:
 * Из файла подается массив целых чисел.
 * Необходимо реализовать три различные сортировки по возрастанию и по убыванию для каждой.
 * Быструю, Слиянием
 */
fun main() {
    val numbersFile = File("numbers.txt")
    val arr = numbersFile.readLines()
        .flatMap { it.split("\\s+".toRegex()) }
        .mapNotNull { it.toIntOrNull() }
        .toIntArray()

    val quickSortStrategyContext = SortContext(QuickSortStrategy())
    val mergeSortStrategyContext = SortContext(MergeSortStrategy())
    val insertionSortStrategyContext = SortContext(InsertionSortStrategy())

    println("Исходный массив: ${arr.joinToString()}")

    val quickSortAscending = quickSortStrategyContext.sort(arr, true)
    val mergeSortAscending = mergeSortStrategyContext.sort(arr, true)
    val insertionSortAscending = insertionSortStrategyContext.sort(arr, true)

    println("Быстрая сортировка по возрастанию: ${quickSortAscending.joinToString()}")
    println("Сортировка слиянием по возрастанию: ${mergeSortAscending.joinToString()}")
    println("Сортировка вставкой по возрастанию: ${insertionSortAscending.joinToString()}")

    val quickSortDescending = quickSortStrategyContext.sort(arr, false)
    val mergeSortDescending = mergeSortStrategyContext.sort(arr, false)
    val insertionSortDescending = insertionSortStrategyContext.sort(arr, false)

    println("Быстрая сортировка по убыванию: ${quickSortDescending.joinToString()}")
    println("Сортировка слиянием по убыванию: ${mergeSortDescending.joinToString()}")
    println("Сортировка вставкой по убыванию: ${insertionSortDescending.joinToString()}")
}
