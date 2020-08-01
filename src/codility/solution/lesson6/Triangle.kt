package codility.solution.lesson6

object Triangle {
    fun solutionLesson6Ver4(A: IntArray): Int {
        A.sort()
        (2 until A.size).forEach { i ->
            if (A[i - 2].toLong() + A[i - 1].toLong() > A[i].toLong()) return 1
        }
        return 0
    }
}
