package hiro_JVM.codility_solution.Lesson4.Counting_Elements

import java.util.*

object MissingInteger {
    fun solution_lesson4_4(A: IntArray): Int {
        var num = 1
        val hset = HashSet<Int>()
        for (aA in A) hset.add(aA)
        while (hset.contains(num)) num++
        return num
    }
}
