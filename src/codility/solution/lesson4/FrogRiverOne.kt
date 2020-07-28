package codility.solution.lesson4

import java.util.HashSet

object FrogRiverOne {
    fun solutionLesson4Ver1(X: Int, A: IntArray): Int {
//        val set = HashSet<Int>()
//        for (i in 1..X) set.add(i)
//        println()
//        for (i in A.indices) {
//            set.remove(A[i])
//            if (set.isEmpty()) return i
//        }
//        return -1
        val set = (1..X).toHashSet()
        A.indices.forEach {
            set.remove(A[it])
            if (set.isEmpty()) return it
        }
        return -1
    }
}
