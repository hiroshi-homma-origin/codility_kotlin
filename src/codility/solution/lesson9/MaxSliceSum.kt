package codility.solution.lesson9

object MaxSliceSum {
    fun solutionLesson9Ver1(A: IntArray): Int {
        var maxEndingPrevious = A[0]
        var maxEndingHere: Int
        var maxSoFar = A[0]
        for (i in 1 until A.size) {
            maxEndingHere = A[i].coerceAtLeast(maxEndingPrevious + A[i])
            maxEndingPrevious = maxEndingHere
            maxSoFar = maxSoFar.coerceAtLeast(maxEndingHere)
        }
        return maxSoFar
    }
}
