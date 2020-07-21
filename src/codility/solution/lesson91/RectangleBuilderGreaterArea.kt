package codility.solution.lesson91

import java.util.*

object RectangleBuilderGreaterArea {
    fun solution_lesson91_1(A: IntArray, X: Int): Int {
        var i = 1
        var j = 0
        var n = A.size
        var count = 0
        var last = 1
        var value: Int
        var index: Int
        var needed: Int
        val limit = 1000000000
        val countArrayTemp = arrayOfNulls<IntArray>(n)

        if (n < 4)
            return 0

        Arrays.sort(A)
        countArrayTemp[0] = intArrayOf(A[0], 1)

        while (i < n) {
            value = A[i]

            if (value == countArrayTemp[last - 1]!![0])
                countArrayTemp[last - 1]!![1]++
            else
                countArrayTemp[last++] = intArrayOf(value, 1)
            i++
        }
        val countArray = arrayOfNulls<IntArray>(last)

        i = 0
        while (i < last) {
            if (countArrayTemp[i]!![1] > 1)
                countArray[j++] = countArrayTemp[i]
            i++
        }

        n = j

        i = 0
        while (i < n - 1) {
            value = countArray[i]!![0]
            needed = Math.ceil(X / value.toDouble()).toInt()
            index = binarySearch(
                countArray,
                i + 1,
                n,
                needed
            )
            index = if (index < 0) index.inv() else index
            count += n - index

            if (value >= needed && countArray[i]!![1] > 3)
                count++

            if (count > limit)
                return -1
            i++
        }

        if (i < n && countArray[i]!![1] > 3 && countArray[i]!![0] >= Math.ceil(X / countArray[i]!![0].toDouble()))
            count++

        return if (count > limit) -1 else count
    }

    private fun binarySearch(a: Array<IntArray?>, beginIndex: Int, endIndex: Int, key: Int): Int {
        var low = beginIndex
        var high = endIndex - 1
        var mid: Int
        var value: Int
        while (low <= high) {
            mid = (low + high).ushr(1)
            value = a[mid]!![0]
            if (key > value)
                low = mid + 1
            else if (key < value)
                high = mid - 1
            else
                return mid
        }

        return low.inv()
    }
}
