package codility.solution.lesson14

object NailingPlanks {
    fun solutionLesson14Ver2(A: IntArray, B: IntArray, C: IntArray): Int {
        val nails = IntArray(2 * C.size + 1)
        var begin = 0
        var end = C.size
        var result = -1
        while (begin <= end) {
            val middle = (begin + end) / 2
            for (i in nails.indices) {
                nails[i] = 0
            }
            for (i in 0 until middle) {
                nails[C[i]] = 1
            }
            var counter = 0
            for (i in nails.indices) {
                if (nails[i] == 1) {
                    counter++
                }
                nails[i] = counter
            }
            var found = true
            for (i in A.indices) {
                if (nails[B[i]] - nails[A[i] - 1] == 0) {
                    found = false
                    break
                }
            }
            if (found) {
                end = middle - 1
                result = middle
            } else {
                begin = middle + 1
            }
        }
        return result
    }
}
