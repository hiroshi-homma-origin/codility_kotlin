package codility_solution.Lesson0.DemoTask

import java.util.*

object DemoTask {
    fun solution_demo(A: IntArray): Int {
        var num = 1
        val hset = HashSet<Int>()
        for (aA in A) hset.add(aA)
        while (hset.contains(num)) num++
        return num
    }
}
