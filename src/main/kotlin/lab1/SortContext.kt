package lab1

class SortContext(private val strategy: SortStrategy) {
    fun sort(arr: IntArray, asc: Boolean): IntArray = strategy.sort(arr.copyOf(), asc)

}