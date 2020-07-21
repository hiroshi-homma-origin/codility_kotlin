package codility.solution.lesson13

import java.util.*
import java.awt.*

object FibFrog {
    fun solutionLesson13Ver1(A: IntArray): Int {

        val fibonacci = ArrayList<Int>()
        fibonacci.add(0)
        fibonacci.add(1)

        while (true) {
            val temp1 = fibonacci[fibonacci.size - 1]
            val temp2 = fibonacci[fibonacci.size - 2]
            fibonacci.add(temp1 + temp2)
            if (temp1 + temp2 > A.size) break
        }

        fibonacci.reverse()

        val queue = ArrayList<Point>()
        queue.add(Point(-1, 0))

        var index = 0
        while (true) {
            if (index == queue.size) return -1

            val current = queue[index]

            for (n in fibonacci) {
                val nextPosition = current.x + n

                if (nextPosition == A.size)
                    return current.y + 1
                else if (nextPosition <= A.size && nextPosition >= 0 && A[nextPosition] != 0) {
                    val temp = Point(nextPosition, current.y + 1)
                    queue.add(temp)
                    A[nextPosition] = 0
                }
            }

            index++
        }
    }
}
