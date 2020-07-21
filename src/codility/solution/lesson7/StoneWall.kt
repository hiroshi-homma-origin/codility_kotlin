package codility.solution.lesson7

import java.util.*

object StoneWall {
    fun solution_lesson7_3(H: IntArray): Int {
        val st = Stack<Int>()
        var numBlock = 0

        for (aH in H) {
            while (!st.isEmpty() && st.peek() > aH) {
                st.pop()
            }
            if (st.isEmpty()) {
                numBlock++
                st.push(aH)
            } else if (st.peek() != aH) {
                if (st.peek() < aH) {
                    numBlock++
                    st.push(aH)
                }
            }
        }

        return numBlock
    }
}
