package codility.solution.lesson4

import java.util.*

object PermCheck {
    fun solution_lesson4_1(A: IntArray): Int {
        val set = HashSet<Int>()

        for (aA in A) set.add(aA)
        for (i in 1..A.size) if (!set.contains(i)) return 0

        return 1
    }
}
