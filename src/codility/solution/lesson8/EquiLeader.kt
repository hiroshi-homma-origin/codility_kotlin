package codility.solution.lesson8

// you can also use imports, for example:
import java.util.*

object EquiLeader {
    fun solution_lesson8_1(A: IntArray): Int {
        if (A.isEmpty()) return 0
        val map = HashMap<Int, Int>()
        for (aA in A) {
            if (!map.containsKey(aA)) {
                map[aA] = 1
            } else {
                map[aA] = map[aA]!! + 1
            }
        }
        var max_Value = A[0]
        var max_Count = 1
        for (j in map.keys) {
            val cur_Count = map[j]
            if (cur_Count!! > max_Count) {
                max_Count = cur_Count
                max_Value = j
            }
        }
        val leader_Value: Int
        val leader_Count: Int
        if (max_Count > 0.5 * A.size) {
            leader_Value = max_Value
            leader_Count = max_Count
        } else {
            return 0
        }
        var num_Equi_leaders = 0
        var left_Leader_Count = 0

        for (i in A.indices) {
            if (A[i] == leader_Value) {
                left_Leader_Count++
            }
            if (left_Leader_Count > 0.5 * (i + 1)) {
                val right_Leader_Count = leader_Count - left_Leader_Count
                if (right_Leader_Count > 0.5 * (A.size - i - 1)) {
                    num_Equi_leaders++
                }
            }
        }
        return num_Equi_leaders
    }
}
