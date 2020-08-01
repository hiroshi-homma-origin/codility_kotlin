package codility.solution.lesson9

object MaxProfit {
    fun solutionLesson9Ver2(A: IntArray): Int {
        if (A.size <= 1) return 0
        var minPrice = A[0]
        var maxProfit = 0

        (1 until A.size).forEach { i ->
            if (A[i] < minPrice)
                minPrice = A[i]
            else {
                val curProfit = A[i] - minPrice
                if (curProfit > maxProfit) maxProfit = curProfit
            }
        }

        return maxProfit
    }
}
