package codility.solution.lesson15

import java.util.*

object AbsDistinct {
    fun solution_lesson15_1(A: IntArray): Int {
        val set = HashSet<Int>()
        for (aA in A) set.add(Math.abs(aA))
        return set.size
    }
}
