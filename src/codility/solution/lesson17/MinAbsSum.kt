package codility.solution.lesson17

import kotlin.math.abs

object MinAbsSum {
    fun solutionLesson17Ver2(A: IntArray): Int {
        var j: Int
        val n = A.size
        var sum = 0
        val mid: Int
        var max = -1
        var maxReached = 0
        var value: Int
        val count = IntArray(101)
        var currentReaches: IntArray
        val reaches: BooleanArray

        var i = 0
        while (i < n) {
            A[i] = abs(A[i])
            count[A[i]]++
            max = max.coerceAtLeast(A[i])
            sum += A[i]
            i++
        }

        mid = sum / 2
        reaches = BooleanArray(mid + 1)
        reaches[0] = true
        i = 1
        while (i <= max) {
            value = count[i]
            if (value == 0) {
                i++
                continue
            }

            currentReaches = IntArray(mid + 1)

            j = 0
            while (j <= mid - i) {
                if (reaches[j])
                    currentReaches[j + i] = value
                else if (currentReaches[j] > 1)
                    currentReaches[j + i] = currentReaches[j + i].coerceAtLeast(currentReaches[j] - 1)
                j++
            }

            j = 1
            while (j <= mid) {
                if (currentReaches[j] > 0) {
                    reaches[j] = true
                    maxReached = maxReached.coerceAtLeast(j)
                }
                j++
            }
            i++
        }

        return sum - 2 * maxReached
    }
}
