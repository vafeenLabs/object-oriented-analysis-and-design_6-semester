package lab1

class QuickSortStrategy : SortStrategy {
    override fun sort(arr: IntArray, ascending: Boolean): IntArray {
        quickSort(arr, 0, arr.size - 1, ascending)
        return arr
    }

    private fun quickSort(arr: IntArray, low: Int, high: Int, ascending: Boolean) {
        if (low < high) {
            val pivotIndex = partition(arr, low, high, ascending)
            quickSort(arr, low, pivotIndex - 1, ascending)
            quickSort(arr, pivotIndex + 1, high, ascending)
        }
    }

    private fun partition(arr: IntArray, low: Int, high: Int, ascending: Boolean): Int {
        val pivot = arr[high]
        var i = low - 1
        for (j in low until high) {
            if ((ascending && arr[j] < pivot) || (!ascending && arr[j] > pivot)) {
                i++
                arr[i] = arr[j].also { arr[j] = arr[i] }
            }
        }
        arr[i + 1] = arr[high].also { arr[high] = arr[i + 1] }
        return i + 1
    }
}