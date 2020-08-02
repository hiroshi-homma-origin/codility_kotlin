package codility.solution.lesson4

object PermCheck {
    fun solutionLesson4Ver4(A: IntArray): Int {
        val set = A.toHashSet()
        (1..A.size).forEach { if (!set.contains(it)) return 0 }
        return 1
    }
}
