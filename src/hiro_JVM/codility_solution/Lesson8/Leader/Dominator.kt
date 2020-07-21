package hiro_JVM.codility_solution.Lesson8.Leader

// you can also use imports, for example:
import java.util.*

object Dominator {
    fun solution_lesson8_2(A: IntArray): Int {
        val map = HashMap<Int, Int>()
        for (aA in A) {
            if (!map.containsKey(aA)) {
                map[aA] = 1
            } else {
                val count = map[aA]
                map[aA] = count!! + 1
            }
        }
        var max_Number = 0
        var max_Count = 0
        for (key in map.keys) {
            val cur_Count = map[key]
            if (cur_Count!! > max_Count) {
                max_Count = cur_Count
                max_Number = key
            }
        }
        if (max_Count <= A.size / 2) {
            return -1
        }
        for (i in A.indices) {
            if (A[i] == max_Number) {
                return i // return the index
            }
        }
        return -1
    }
}
