package codility.solution.lesson6

import java.util.*

object NumberOfDiscIntersections {
    fun solutionLesson6Ver4To1(A: IntArray): Int {
        var intersection = 0
        var j = 0
        val lower = LongArray(A.size)
        val upper = LongArray(A.size)

        for (i in A.indices) {
            lower[i] = i - A[i].toLong()
            upper[i] = i + A[i].toLong()
        }

        Arrays.sort(upper)
        Arrays.sort(lower)

        for (i in A.indices) {
            while (j < A.size && upper[i] >= lower[j]) {
                intersection += j
                intersection -= i
                j++
            }
        }

        return if (intersection > 10000000) -1 else intersection

    }
}
