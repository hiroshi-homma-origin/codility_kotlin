package codility.solution.lesson15

import kotlin.math.abs


object MinAbsSumOfTwo {

    fun solutionLesson15Ver4(A: IntArray): Int {
        A.sort()
        var tail = 0
        var head = A.size - 1
        var minAbsSum = abs(A[0] + A[A.size - 1])
        while (tail <= head) {
            val currentSum = abs(A[tail] + A[head])
            minAbsSum = minAbsSum.coerceAtMost(currentSum)
            // tailの方から指定して考える。
            if (A[tail] + A[head] <= 0) tail++ else head--
        }
        return minAbsSum
    }
}