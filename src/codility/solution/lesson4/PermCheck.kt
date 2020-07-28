package codility.solution.lesson4

import java.util.*

object PermCheck {
    fun solutionLesson4Ver4(A: IntArray): Int {
        val set = A.toHashSet()
        for (i in 1..A.size) if (!set.contains(i)) return 0
        return 1
    }
}
