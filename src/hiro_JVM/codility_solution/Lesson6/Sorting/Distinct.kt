package hiro_JVM.codility_solution.Lesson6.Sorting

import java.util.*

object Distinct {
    fun solution_lesson6_1(A: IntArray): Int {
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
