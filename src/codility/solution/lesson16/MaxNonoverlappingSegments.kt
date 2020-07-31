package codility.solution.lesson16

object MaxNonoverlappingSegments {
    fun solutionLesson16Ver1(A: IntArray, B: IntArray): Int {
        if (A.isEmpty()) return 0
        var numNonOverlap = 1

        (A.size - 2 downTo 0).forEach {
            when {
                A[A.size - 1] > B[it] -> {
                    numNonOverlap++
                    A[A.size - 1] = A[it]
                }
                A[it] > A[A.size - 1] -> {
                    A[A.size - 1] = A[it]
                }
            }
        }

        return numNonOverlap
    }
}
