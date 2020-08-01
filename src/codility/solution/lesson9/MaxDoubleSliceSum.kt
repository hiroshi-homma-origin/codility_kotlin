package codility.solution.lesson9

object MaxDoubleSliceSum {
    fun solutionLesson9Ver1(A: IntArray): Int {
        val maxLeft = IntArray(A.size)
        val maxRight = IntArray(A.size)
        (1 until A.size).forEach { i ->
            maxLeft[i] = 0.coerceAtLeast(maxLeft[i - 1] + A[i])
        }
        (A.size - 2 downTo 0).forEach { i ->
            maxRight[i] = 0.coerceAtLeast(maxRight[i + 1] + A[i])
        }

        var maxDoubleSlice = 0
        (1 until A.size - 1).forEach { i ->
            if (maxLeft[i - 1] + maxRight[i + 1] > maxDoubleSlice)
                maxDoubleSlice = maxLeft[i - 1] + maxRight[i + 1]
        }

        return maxDoubleSlice
    }
}
