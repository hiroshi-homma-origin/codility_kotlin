package codility_solution.Lesson9.Maximum_slice_problem

object MaxProfit {
    fun solution_lesson9_2(A: IntArray): Int {
        if (A.size <= 1) return 0
        var minPrice = A[0]
        var maxProfit = 0

        for (i in 1 until A.size) {
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
