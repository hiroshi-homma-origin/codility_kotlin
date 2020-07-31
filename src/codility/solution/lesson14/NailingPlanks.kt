package codility.solution.lesson14

object NailingPlanks {
    fun solutionLesson14Ver2(A: IntArray, B: IntArray, C: IntArray): Int {
        var minPlanks = 1
        var maxPlanks: Int = C.size
        var result = -1
        while (minPlanks <= maxPlanks) {
            val midPlanks = (maxPlanks + minPlanks) / 2
            if (allNailed(midPlanks, A, B, C)) {
                maxPlanks = midPlanks - 1
                result = midPlanks
            } else {
                minPlanks = midPlanks + 1
            }
        }
        return result
    }

    private fun allNailed(planksCount: Int, A: IntArray, B: IntArray, C: IntArray): Boolean {
        // AとB双方で必要なので「2 *」用意する
        val isNailsMarked = IntArray(2 * C.size + 1)
        (0 until planksCount).forEach { isNailsMarked[C[it]] = 1 }
        println("check_isNailsMarked:${isNailsMarked.toMutableList()}")
        (1 until isNailsMarked.size).forEach {
            isNailsMarked[it] += isNailsMarked[it - 1]
        }
//        println("check_isNailsMarked:${isNailsMarked.toMutableList()}")
        var allNailed = true
        var i = 0
        while (i < A.size && allNailed) {
            allNailed = isNailsMarked[B[i]] - isNailsMarked[A[i] - 1] > 0
            i++
        }
        return allNailed
    }
}
