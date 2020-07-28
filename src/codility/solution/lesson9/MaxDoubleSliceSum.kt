package codility.solution.lesson9

object MaxDoubleSliceSum {
    fun solutionLesson9Ver3(A: IntArray): Int {

        val maxLeft = IntArray(A.size)
        val maxRight = IntArray(A.size)

        for (i in 1 until A.size) {
            maxLeft[i] = 0.coerceAtLeast(maxLeft[i - 1] + A[i])
        }

        for (i in A.size - 2 downTo 0) {
            maxRight[i] = 0.coerceAtLeast(maxRight[i + 1] + A[i])
        }

        var maxDoubleSlice = 0
        for (i in 1 until A.size - 1) {
            if (maxLeft[i - 1] + maxRight[i + 1] > maxDoubleSlice)
                maxDoubleSlice = maxLeft[i - 1] + maxRight[i + 1]
        }

        return maxDoubleSlice
    }
}
