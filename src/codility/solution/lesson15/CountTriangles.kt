package codility.solution.lesson15

import java.util.*

object CountTriangles {
    fun solution_lesson15_3(A: IntArray): Int {
        var numTriangle = 0
        Arrays.sort(A)
        for (i in 0 until A.size - 2) {
            var leftEnd = i + 1
            var rightEnd = i + 2

            while (leftEnd < A.size - 1) {
                if (rightEnd < A.size && A[i] + A[leftEnd] > A[rightEnd]) {
                    rightEnd++
                } else {
                    numTriangle += (rightEnd - leftEnd - 1)
                    leftEnd++
                }
            }
        }

        return numTriangle
    }
}
