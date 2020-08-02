package codility.solution.lesson3

object PermMissingElem {
    fun solutionLesson3Ver1(A: IntArray): Int {
        val range = (A.size + 1).toLong()
        var missingNum = (range + 1) * range / 2
        A.map { missingNum -= it }
        return missingNum.toInt()
    }
}
