package codility.solution.lesson13

import java.awt.Point
import java.util.*

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

            fibonacci.forEach { n ->
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
    fun solutionLesson13Ver1to1(A: IntArray): Int {
        val fib = IntArray(if (A.size < 2) 2 else A.size + 1)
        fib[0] = 1
        fib[1] = 2
        var fs = 2
        while (fib[fs - 1] <= A.size) {
            fib[fs] = fib[fs - 1] + fib[fs - 2]
            fs++
        }
        var result = -1
        for (i in 0..A.size) {
            if (i == A.size || A[i] == 1) {
                var min = Int.MAX_VALUE
                var j = 0
                while (j < fs && fib[j] <= i + 1) {
                    val from = i - fib[j]
                    if (from == -1) {
                        min = 1
                    } else if (A[from] > 0) {
                        if (A[from] + 1 < min) {
                            min = A[from] + 1
                        }
                    }
                    j++
                }
                if (i < A.size) {
                    if (min == Int.MAX_VALUE) {
                        A[i] = 0
                    } else {
                        A[i] = min
                    }
                } else {
                    if (min != Int.MAX_VALUE) {
                        result = min
                    }
                }
            }
        }
        return result
    }
}
