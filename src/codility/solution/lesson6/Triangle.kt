package codility.solution.lesson6

import java.util.*

object Triangle {
    fun solutionLesson6Ver2(A: IntArray): Int {
        Arrays.sort(A)
        for (i in 2 until A.size) {
            if (A[i - 2].toLong() + A[i - 1].toLong() > A[i].toLong())
                return 1
        }
        return 0
    }
}
