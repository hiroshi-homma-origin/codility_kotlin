package codility.solution.lesson3

import kotlin.math.absoluteValue

//import java.util.*;

object TapeEquilibrium {
    fun solutionLesson3Ver3(A: IntArray): Int {
        var sum = A.sum()
        var increase = 0
        var minDiff = Integer.MAX_VALUE

        A.forEachIndexed { index, value ->
            if (index < A.size - 1) {
                increase += value
                sum -= value
                minDiff = minDiff.coerceAtMost((increase - sum).absoluteValue)
            }
        }
        return minDiff
    }
}
