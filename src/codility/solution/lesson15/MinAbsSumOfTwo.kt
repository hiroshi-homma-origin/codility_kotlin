package codility.solution.lesson15

import kotlin.math.abs

object MinAbsSumOfTwo {
    fun solutionLesson15Ver4(A: IntArray): Int {
        A.sort()
        var j = A.size - 1
        var result = Integer.MAX_VALUE
        for (value in A) {
            var best = abs(value + A[j])
            while (j > 0 && abs(value + A[j - 1]) <= best) {
                j--
                best = abs(value + A[j])
            }
            if (result > best) result = best
        }
        return result
    }
}