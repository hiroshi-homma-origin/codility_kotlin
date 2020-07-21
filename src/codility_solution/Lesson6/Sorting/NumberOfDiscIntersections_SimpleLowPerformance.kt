package codility_solution.Lesson6.Sorting

object NumberOfDiscIntersections_SimpleLowPerformance {
    fun solution_lesson6_4_2(A: IntArray): Int {
        var intersection = 0
        val lower = LongArray(A.size)
        val upper = LongArray(A.size)

        for (i in A.indices) {
            lower[i] = i - A[i].toLong()
            upper[i] = i + A[i].toLong()
        }

        for (i in A.indices) {
            for (j in i + 1 until A.size) {
                if (upper[i] >= lower[j]) intersection++
            }
        }

        return if (intersection > 10000000) -1 else intersection

    }
}
