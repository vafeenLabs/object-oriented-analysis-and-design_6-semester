package lab1

class MergeSortStrategy : SortStrategy {
    override fun sort(arr: IntArray, ascending: Boolean): IntArray {
        mergeSort(arr, 0, arr.size - 1, ascending)
        return arr
    }

    private fun mergeSort(arr: IntArray, low: Int, high: Int, ascending: Boolean) {
        if (low < high) {
            val mid = (low + high) / 2
            mergeSort(arr, low, mid, ascending)
            mergeSort(arr, mid + 1, high, ascending)
            merge(arr, low, mid, high, ascending)
        }
    }

    private fun merge(arr: IntArray, low: Int, mid: Int, high: Int, ascending: Boolean) {
        val leftSize = mid - low + 1
        val rightSize = high - mid
        val left = IntArray(leftSize)
        val right = IntArray(rightSize)

        System.arraycopy(arr, low, left, 0, leftSize)
        System.arraycopy(arr, mid + 1, right, 0, rightSize)

        var i = 0
        var j = 0
        var k = low

        while (i < leftSize && j < rightSize) {
            if ((ascending && left[i] <= right[j]) || (!ascending && left[i] >= right[j])) {
                arr[k] = left[i]
                i++
            } else {
                arr[k] = right[j]
                j++
            }
            k++
        }

        while (i < leftSize) {
            arr[k] = left[i]
            i++
            k++
        }

        while (j < rightSize) {
            arr[k] = right[j]
            j++
            k++
        }
    }
}