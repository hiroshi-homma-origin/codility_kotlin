package hiro_JVM.codility_solution.Lesson9.Maximum_slice_problem

object MaxSliceSum {
    fun solution_lesson9_1(A: IntArray): Int {
        var maxEndingPrevious = A[0]
        var maxEndingHere: Int
        var maxSoFar = A[0]
        for (i in 1 until A.size) {
            maxEndingHere = Math.max(A[i], maxEndingPrevious + A[i])
            maxEndingPrevious = maxEndingHere
            maxSoFar = Math.max(maxSoFar, maxEndingHere)
        }
        return maxSoFar
    }
}
