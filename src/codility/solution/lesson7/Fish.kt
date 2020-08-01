package codility.solution.lesson7

import java.util.*

object Fish {
    fun solutionLesson7Ver2(A: IntArray, B: IntArray): Int {
        if (A.isEmpty()) return 0
        val stack = Stack<Int>()
        var numAlive = A.size
        A.indices.forEach { i->
            when (B[i]) {
                1 -> stack.push(A[i])
                0 -> while (!stack.isEmpty()) {
                    if (stack.peek() > A[i]) {
                        numAlive--
                        break
                    } else if (stack.peek() < A[i]) {
                        numAlive--
                        stack.pop()
                    }
                }
            }
        }
        return numAlive
    }
}
