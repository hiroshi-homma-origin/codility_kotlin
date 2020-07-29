package codility.solution.lesson5

import kotlin.math.floor

object CountDiv {
    fun solutionLesson5Ver1(A: Int, B: Int, K: Int): Int {
        if (A % K == 0) return (B - A) / K + 1
        return (B - (A - A % K)) / K
    }
}
