package codility.solution.lesson15

import java.util.*
import kotlin.math.abs

object AbsDistinct {
    fun solutionLesson15Ver1(A: IntArray): Int {
        val set = HashSet<Int>()
        for (aA in A) set.add(abs(aA))
        return set.size
    }
}
