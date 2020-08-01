package codility.solution.lesson11

object CountNonDivisible {
    fun solutionLesson11Ver1(A: IntArray): IntArray {
        val counts = IntArray(A.size * 2 + 1)
        A.forEach { counts[it]++ }
        val divisorNums = IntArray(counts.size)
        var i = 1
        while (i * i < divisorNums.size) {
            var j = i * i
            while (j < divisorNums.size) {
                divisorNums[j] += counts[i]
                if (j != i * i) {
                    divisorNums[j] += counts[j / i]
                }
                j += i
            }
            i++
        }

        val result = IntArray(A.size)
        result.indices.forEach {
            result[it] = A.size - divisorNums[A[it]]
        }
        return result
    }
}
