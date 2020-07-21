package codility_solution.Lesson4.Counting_Elements

import java.util.HashSet

object FrogRiverOne {
    fun solution_lesson4_2(X: Int, A: IntArray): Int {
        val set = HashSet<Int>()
        for (i in 1..X) set.add(i)
        for (i in A.indices) {
            set.remove(A[i])
            if (set.isEmpty()) return i
        }
        return -1
    }
}
