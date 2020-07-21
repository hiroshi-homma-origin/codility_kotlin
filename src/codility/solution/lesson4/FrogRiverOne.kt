package codility.solution.lesson4

import java.util.HashSet

object FrogRiverOne {
    fun solutionLesson4Ver2(X: Int, A: IntArray): Int {
        val set = HashSet<Int>()
        for (i in 1..X) set.add(i)
        for (i in A.indices) {
            set.remove(A[i])
            if (set.isEmpty()) return i
        }
        return -1
    }
}
