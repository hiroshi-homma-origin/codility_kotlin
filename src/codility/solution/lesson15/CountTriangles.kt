package codility.solution.lesson15

object CountTriangles {
    fun solutionLesson15Ver3(A: IntArray): Int {
        A.sort()
        var result = 0
        (A.indices).forEach {
            var q: Int = it + 1
            var r: Int = it + 2
            while (r < A.size) {
                if (A[it] + A[q] > A[r]) {
                    result += r - q
                    r++
                } else {
                    q++
                    if (r == q) r++
                }
            }
        }
        return result
    }

}
