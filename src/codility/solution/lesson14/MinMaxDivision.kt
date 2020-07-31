package codility.solution.lesson14

object MinMaxDivision {
    fun solutionLesson14Ver1(K: Int, A: IntArray): Int {
        var minSum = 0
        var maxSum = 0

        A.forEach {
            maxSum += it
            minSum = minSum.coerceAtLeast(it)
            println("check_sum")
        }

        var possibleResult = maxSum

        while (minSum <= maxSum) {
            val midSum = (minSum + maxSum) / 2
            val ok = check(midSum, K, A)
            if (ok) {
                possibleResult = midSum
                maxSum = midSum - 1
            } else {
                minSum = midSum + 1
            }
        }

        return possibleResult
    }

    private fun check(mid: Int, k: Int, a: IntArray): Boolean {
        var numBlockAllowed = k
        var currentBlockSum = 0
        a.forEach {
            currentBlockSum += it
            if (currentBlockSum > mid) {
                numBlockAllowed--
                currentBlockSum = it
            }
            if (numBlockAllowed == 0) {
                return false
            }
        }
        return true
    }
}
