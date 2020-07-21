package codility.solution.lesson0

import java.util.*

object DemoTask {
    fun solutionDemo(A: IntArray): Int {
        var num = 1
        A.toHashSet().apply { while (contains(num)) num++ }
        return num
    }
}
