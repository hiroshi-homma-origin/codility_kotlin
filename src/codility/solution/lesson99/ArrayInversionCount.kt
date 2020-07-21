package codility.solution.lesson99

object ArrayInversionCount {
    private val LIMIT = 1000000000
    fun solution_lesson99_3(A: IntArray): Int {
        val inversionNum = countInversion(A, 0, A.size - 1)
        return if (inversionNum > LIMIT) -1 else inversionNum.toInt()
    }

    private fun countInversion(A: IntArray, begin: Int, end: Int): Long {
        if (begin >= end) {
            return 0
        }

        val middle = (begin + end) / 2
        var inversionNum = countInversion(
            A,
            begin,
            middle
        ) + countInversion(A, middle + 1, end)
        val merged = IntArray(end - begin + 1)
        var index1 = begin
        var index2 = middle + 1
        for (i in merged.indices) {
            if (index2 == end + 1 || index1 != middle + 1 && A[index1] <= A[index2]) {
                merged[i] = A[index1]
                index1++
            } else {
                merged[i] = A[index2]
                index2++
                inversionNum += (middle + 1 - index1).toLong()
            }
        }
        if (end + 1 - begin >= 0) System.arraycopy(merged, 0, A, begin, end + 1 - begin)
        return inversionNum
    }
}
