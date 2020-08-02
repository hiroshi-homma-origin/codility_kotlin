package codility.solution.lesson7

import java.util.*

object Fish {
    var numAlive = 0
    fun solutionLesson7Ver2(A: IntArray, B: IntArray): Int {
        if (A.isEmpty()) return 0
        val stack = Stack<Int>()
        numAlive = A.size
        A.indices.forEach { i->
            when (B[i]) {
                1 -> stack.push(A[i])
                0 -> checkStack(stack,A[i])
            }
        }
        return numAlive
    }

    private fun checkStack(stack: Stack<Int>, a: Int) {
        while (!stack.isEmpty()) {
            if (stack.peek() > a) {
                numAlive--
                break
            } else if (stack.peek() < a) {
                numAlive--
                stack.pop()
            }
        }
    }
}
