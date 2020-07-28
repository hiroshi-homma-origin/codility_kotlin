package codility.solution.lesson5

object MinAvgTwoSlice {
    fun solutionLesson5Ver3(A: IntArray): Int {
        var min = Integer.MAX_VALUE.toFloat()
        var minStartPosition = 0
        for (i in 0 until A.size - 2) {

            val avg2 = (A[i] + A[i + 1]).toFloat() / 2
            val avg3 = (A[i] + A[i + 1] + A[i + 2]).toFloat() / 3

            val curMinAvg = Math.min(avg2, avg3)

            if (curMinAvg < min) {
                min = curMinAvg
                minStartPosition = i
            }
        }

        val avg2 = (A[A.size - 2] + A[A.size - 1]) / 2
        if (avg2 < min) {
            minStartPosition = A.size - 2
        }

        return minStartPosition
    }
}
