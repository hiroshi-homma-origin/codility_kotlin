package codility.solution.lesson6

import java.util.*

object Distinct {
    fun solutionLesson6Ver1(A: IntArray): Int {
        if (A.isEmpty()) return 0
        var result = 1
        Arrays.sort(A)

        for (i in 1 until A.size) {
            if (A[i] != A[i - 1]) {
                result++
            }
        }

        return result
    }
}
