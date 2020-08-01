package codility.solution.lesson4

object MissingInteger {
    fun solutionLesson4Ver3(A: IntArray): Int {
        var num = 1
        A.toHashSet().apply { while (contains(num)) num++ }
        return num
    }
}
