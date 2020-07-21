package codility.solution.lesson17

object NumberSolitaire {
    fun solution_lesson17_1(A: IntArray): Int {
        val dp = IntArray(A.size)
        dp[0] = A[0]
        for (i in 1 until A.size) {
            var max = Integer.MIN_VALUE
            for (die in 1..6) {
                if (i - die >= 0) {
                    max = Math.max(dp[i - die] + A[i], max)
                }
            }
            dp[i] = max
        }

        return dp[A.size - 1]
    }
}
