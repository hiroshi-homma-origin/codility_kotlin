package codility.solution.lesson15

object CountDistinctSlices {
    fun solutionLesson15Ver2(M: Int, A: IntArray): Int {
        val seen = BooleanArray(M + 1)
        var leftEnd = 0
        var rightEnd = 0
        var numSlice = 0

        while (leftEnd < A.size && rightEnd < A.size) {
            if (!seen[A[rightEnd]]) {
                numSlice += (rightEnd - leftEnd + 1)
                if (numSlice >= 1000000000)
                    return 1000000000
                seen[A[rightEnd]] = true
                rightEnd++
            } else {
                seen[A[leftEnd]] = false
                leftEnd++
            }
        }

        return numSlice
    }
}
