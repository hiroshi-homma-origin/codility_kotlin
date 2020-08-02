package codility.solution.lesson6

object Triangle {
    fun solutionLesson6Ver4(A: IntArray): Int {
        A.sort()
        (0 until A.size-2).forEach { p ->
            val ap: Int = A[p]
            val aq: Int = A[p + 1]
            val ar: Int = A[p + 2]
            if (ap + aq > ar && aq + ar > ap && ar + aq > ap) return 1
        }
        return 0
    }
}
