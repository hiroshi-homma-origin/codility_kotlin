package codility.solution.lesson17

import kotlin.math.abs
import kotlin.math.floor

object MinAbsSum {
    fun solutionLesson17Ver1(A: IntArray): Int {

        var max = 0
        A.indices.forEach { i ->
            A[i] = abs(A[i])
            max = A[i].coerceAtLeast(max)
        }
        val sum = A.sum()

        val dp = IntArray(sum + 1) { -1 }
        dp[0] = 0
        val count = IntArray(max + 1)
        var result = sum
        var check = 0

        A.indices.forEach { i -> count[A[i]] += 1 }
        (1 until max + 1).forEach { i ->
            if (count[i] > 0) {
                (0 until sum).forEach { j->
                    if (dp[j] >= 0) {
                        dp[j] = count[i]
                    } else if (j >= i && dp[j - i] > 0) {
                        dp[j] = dp[j - i] - 1
                    }
                }
            }
        }
        while (check < floor(sum / 2.toDouble()) + 1) {
            if (dp[check] >= 0) {
                result = result.coerceAtMost(sum - 2 * check)
            }
            check++
        }
        return result
    }
}
