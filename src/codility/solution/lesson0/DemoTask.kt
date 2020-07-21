package codility.solution.lesson0

import java.util.*

object DemoTask {
    fun solutionDemo(A: IntArray): Int {
        var num = 1
        val hset = HashSet<Int>()
        for (aA in A) hset.add(aA)
        while (hset.contains(num)) num++
        return num
    }
}
