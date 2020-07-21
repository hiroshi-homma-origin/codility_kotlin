package codility.solution.lesson6

import java.util.*

object MaxProductOfThree {
    fun solutionLesson6Ver3(A: IntArray): Int {
        Arrays.sort(A)
        println(Arrays.toString(A))
        val max_1 = A[A.size - 1] * A[A.size - 2] * A[A.size - 3]
        val max_2 = A[0] * A[1] * A[A.size - 1]
        return Math.max(max_1, max_2)
    }
}
