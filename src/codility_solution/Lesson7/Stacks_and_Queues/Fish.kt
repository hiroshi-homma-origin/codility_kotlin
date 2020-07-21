package codility_solution.Lesson7.Stacks_and_Queues

// you can also use imports, for example:
import java.util.*

object Fish {
    fun solution_lesson7_4(A: IntArray, B: IntArray): Int {
        if (A.isEmpty()) return 0
        val st = Stack<Int>()
        var numAlive = A.size

        for (i in A.indices) {
            if (B[i] == 1) {
                st.push(A[i])
            }
            if (B[i] == 0) {
                while (!st.isEmpty()) {
                    if (st.peek() > A[i]) {
                        numAlive--
                        break
                    } else if (st.peek() < A[i]) {
                        numAlive--
                        st.pop()
                    }
                }
            }
        }
        return numAlive
    }
}
