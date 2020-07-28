package codility.solution.lesson10

import kotlin.math.sqrt

object CountFactors {
    fun solutionLesson10Ver1(N: Int): Int {
        val sqrtN = sqrt(N.toDouble()).toInt()
        var numFactor = 0
        for (i in 1..sqrtN) {
            if (N % i == 0) {
                numFactor++
            }
        }
        numFactor *= 2
        if (sqrtN * sqrtN == N) numFactor -= 1
        return numFactor
    }
}
