package codility.solution.lesson8

// you can also use imports, for example:
import java.util.*

object Dominator {
    fun solutionLesson8Ver2(A: IntArray): Int {
        val map = HashMap<Int, Int>()
        for (aA in A) {
            if (!map.containsKey(aA)) {
                map[aA] = 1
            } else {
                val count = map[aA]
                map[aA] = count!! + 1
            }
        }
        var maxNumber = 0
        var maxCount = 0
        for (key in map.keys) {
            val curCount = map[key]
            if (curCount!! > maxCount) {
                maxCount = curCount
                maxNumber = key
            }
        }
        if (maxCount <= A.size / 2) {
            return -1
        }
        for (i in A.indices) {
            if (A[i] == maxNumber) {
                return i // return the index
            }
        }
        return -1
    }
}
