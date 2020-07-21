package codility.solution.lesson15

import java.util.*

object MinAbsSumOfTwo {
    fun solutionLesson15Ver4(A: IntArray): Int {
        Arrays.sort(A)
        var j = A.size - 1
        var result = Integer.MAX_VALUE
        for (value in A) {
            var best = Math.abs(value + A[j])
            while (j > 0 && Math.abs(value + A[j - 1]) <= best) {
                j--
                best = Math.abs(value + A[j])
            }
            if (result > best) result = best
        }
        return result
    }
}