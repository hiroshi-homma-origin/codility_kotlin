package codility.solution.lesson15

object CountTriangles {
    fun solutionLesson15Ver3(A: IntArray): Int {
        A.sort()
        var result = 0
        (0 until A.size - 2).forEach { p ->
            var q: Int = p + 1
            var r: Int = p + 2
            while (r < A.size) {
                when {
                    A[p] + A[q] > A[r] -> {
                        result += r - q
                        r++
                    }
                    r == q -> r++
                    else -> q++
                }
            }
        }
        return result
    }
}
