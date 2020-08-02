package codility.solution.lesson6

object NumberOfDiscIntersections {
    fun solutionLesson6Ver3(A: IntArray): Int {
        var intersection = 0
        var j = 0
        val lower = LongArray(A.size)
        val upper = LongArray(A.size)
        // ディスクのX軸の座標を出す。
        A.indices.forEach {
            lower[it] = it - A[it].toLong()
            upper[it] = it + A[it].toLong()
        }
        upper.sort()
        lower.sort()
        A.indices.forEach {
            while (j < A.size && upper[it] >= lower[j]) {
                intersection += j - it
                j++
            }
        }

        return if (intersection > 10000000) -1 else intersection
    }
}
