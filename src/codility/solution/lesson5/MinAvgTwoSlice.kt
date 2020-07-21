package codility.solution.lesson5

object MinAvgTwoSlice {
    fun solution_lesson5_3(A: IntArray): Int {
        var min = Integer.MAX_VALUE.toFloat()
        var min_start_position = 0
        for (i in 0 until A.size - 2) {

            val avg_2 = (A[i] + A[i + 1]).toFloat() / 2
            val avg_3 = (A[i] + A[i + 1] + A[i + 2]).toFloat() / 3

            val cur_min_avg = Math.min(avg_2, avg_3)

            if (cur_min_avg < min) {
                min = cur_min_avg
                min_start_position = i
            }
        }

        val avg_2 = (A[A.size - 2] + A[A.size - 1]) / 2
        if (avg_2 < min) {
            min_start_position = A.size - 2
        }

        return min_start_position
    }
}
