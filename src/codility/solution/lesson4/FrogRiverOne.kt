package codility.solution.lesson4

object FrogRiverOne {
    fun solutionLesson4Ver1(X: Int, A: IntArray): Int {
        val set = (1..X).toHashSet()
        A.indices.forEach {
            set.remove(A[it])
            if (set.isEmpty()) return it
        }
        return -1
    }
}
