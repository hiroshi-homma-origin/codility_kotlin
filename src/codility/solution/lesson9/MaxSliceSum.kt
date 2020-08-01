package codility.solution.lesson9

object MaxSliceSum {
    fun solutionLesson9Ver3(A: IntArray): Int {
        var maxEndingPrevious = A[0]
        var maxEndingHere: Int
        var maxSoFar = A[0]
        (1 until A.size).forEach { i ->
            maxEndingHere = A[i].coerceAtLeast(maxEndingPrevious + A[i])
            maxEndingPrevious = maxEndingHere
            maxSoFar = maxSoFar.coerceAtLeast(maxEndingHere)
        }
        return maxSoFar
    }
}
