package lab1

class InsertionSortStrategy : SortStrategy {
    override fun sort(arr: IntArray, ascending: Boolean): IntArray {
        for (i in 1 until arr.size) {
            val key = arr[i]
            var j = i - 1
            while (j >= 0 && ((ascending && arr[j] > key) || (!ascending && arr[j] < key))) {
                arr[j + 1] = arr[j]
                j--
            }
            arr[j + 1] = key
        }
        return arr
    }
}