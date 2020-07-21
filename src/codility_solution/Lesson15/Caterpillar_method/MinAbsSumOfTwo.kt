package codility_solution.Lesson15.Caterpillar_method

import java.util.*

object MinAbsSumOfTwo {
    fun solution_lesson15_4(A: IntArray): Int {
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