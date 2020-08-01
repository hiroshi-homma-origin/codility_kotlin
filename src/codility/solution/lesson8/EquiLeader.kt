package codility.solution.lesson8

// you can also use imports, for example:
import java.util.*

object EquiLeader {
    fun solutionLesson8Ver2(A: IntArray): Int {
        if (A.isEmpty()) return 0
        val map = HashMap<Int, Int>()
        A.forEach {
            if (!map.containsKey(it)) {
                map[it] = 1
            } else {
                map[it] = map[it]!! + 1
            }
        }
        var maxValue = A[0]
        var maxCount = 1
        map.keys.forEach { j ->
            val curCount = map[j]
            if (curCount!! > maxCount) {
                maxCount = curCount
                maxValue = j
            }
        }
        val leaderValue: Int
        val leaderCount: Int
        if (maxCount > 0.5 * A.size) {
            leaderValue = maxValue
            leaderCount = maxCount
        } else {
            return 0
        }
        var numEquiLeaders = 0
        var leftLeaderCount = 0

        A.indices.forEach { i ->
            if (A[i] == leaderValue) {
                leftLeaderCount++
            }
            if (leftLeaderCount > 0.5 * (i + 1)) {
                val rightLeaderCount = leaderCount - leftLeaderCount
                if (rightLeaderCount > 0.5 * (A.size - i - 1)) {
                    numEquiLeaders++
                }
            }
        }
        return numEquiLeaders
    }
}
