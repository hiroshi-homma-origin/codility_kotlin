package codility.solution.lesson6

object MaxProductOfThree {
    fun solutionLesson6Ver2(A: IntArray): Int {
        A.sort()
        val rightMax = A[A.size - 1] * A[A.size - 2] * A[A.size - 3]
        val leftMax = A[0] * A[1] * A[A.size - 1]
        return rightMax.coerceAtLeast(leftMax)
    }
}
