package codility.solution.lesson7

import java.util.*

object StoneWall {
    fun solutionLesson7Ver4(H: IntArray): Int {
        val st = Stack<Int>()
        var numBlock = 0

        H.forEach {
            while (!st.isEmpty() && st.peek() > it) {
                st.pop()
            }
            when {
                st.isEmpty() -> {
                    numBlock++
                    st.push(it)
                }
                st.peek() < it -> {
                    numBlock++
                    st.push(it)
                }
            }
        }

        return numBlock
    }
}
