package lab1

// Интерфейс стратегии сортировки
interface SortStrategy {
    fun sort(arr: IntArray, ascending: Boolean): IntArray
}