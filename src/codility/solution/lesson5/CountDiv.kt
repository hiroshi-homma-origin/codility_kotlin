package codility.solution.lesson5

import kotlin.math.floor

object CountDiv {
    fun solutionLesson5Ver4(A: Int, B: Int, K: Int): Int {
        val result1 = B / K
        val result2 = A / K
        val numB = floor(result1.toDouble()).toInt()
        val numA = floor(result2.toDouble()).toInt()
        var numDiv = numB - numA
        var plus = 0
        if (A % K == 0) plus = 1
        numDiv += plus
        return numDiv
    }
}
