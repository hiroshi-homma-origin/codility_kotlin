package codility.solution.lesson4

import java.util.*

object MissingInteger {
    fun solutionLesson4Ver4(A: IntArray): Int {
        var num = 1
        val hset = HashSet<Int>()
        for (aA in A) hset.add(aA)
        while (hset.contains(num)) num++
        return num
    }
}
