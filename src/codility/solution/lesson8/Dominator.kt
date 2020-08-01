package codility.solution.lesson8

// you can also use imports, for example:
import kotlin.collections.HashMap

object Dominator {
    fun solutionLesson8Ver1(A: IntArray): Int {
        val countList = HashMap<Int, Int>()
        A.forEach {
            if (!countList.containsKey(it)) {
                countList[it] = 1
            } else {
                val count = countList[it]
                countList[it] = count!! + 1
            }
        }
        var maxNumber = 0
        var maxCount = 0
        countList.keys.forEach { key->
            val curCount = countList[key]
            if (curCount!! > maxCount) {
                maxCount = curCount
                maxNumber = key
            }
        }
        if (maxCount <= A.size / 2) {
            return -1
        }
        A.indices.forEach {
            if(A[it] == maxNumber) {
                return it
            }
        }
        return -1
    }
}
