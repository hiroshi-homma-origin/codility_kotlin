package hiro_JVM.codility_solution.Lesson6.Sorting

import java.util.*

object MaxProductOfThree {
    fun solution_lesson6_3(A: IntArray): Int {
        Arrays.sort(A)
        println(Arrays.toString(A))
        val max_1 = A[A.size - 1] * A[A.size - 2] * A[A.size - 3]
        val max_2 = A[0] * A[1] * A[A.size - 1]
        return Math.max(max_1, max_2)
    }
}
