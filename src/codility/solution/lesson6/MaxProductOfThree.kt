package codility.solution.lesson6

object MaxProductOfThree {
    fun solutionLesson6Ver3(A: IntArray): Int {
        A.sort()
        println(A.contentToString())
        val max1 = A[A.size - 1] * A[A.size - 2] * A[A.size - 3]
        val max2 = A[0] * A[1] * A[A.size - 1]
        return max1.coerceAtLeast(max2)
    }
}
