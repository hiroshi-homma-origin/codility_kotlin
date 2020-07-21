package codility.solution.lesson16

object MaxNonoverlappingSegments {
    fun solutionLesson16Ver1(A: IntArray, B: IntArray): Int {
        if (A.isEmpty()) return 0
        var currentLeftEnd = A[A.size - 1]
        var numNonOverlap = 1

        for (i in A.size - 2 downTo 0) {
            if (B[i] < currentLeftEnd) {
                numNonOverlap++
                currentLeftEnd = A[i]
            }
            if (A[i] > currentLeftEnd) currentLeftEnd = A[i]
        }

        return numNonOverlap
    }
}