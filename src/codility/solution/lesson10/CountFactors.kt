package codility.solution.lesson10

object CountFactors {
    fun solution_lesson10_1(N: Int): Int {
        val sqrtN = Math.sqrt(N.toDouble()).toInt()
        var numFactor = 0
        for (i in 1..sqrtN) {
            if (N % i == 0) {
                numFactor++
            }
        }
        numFactor *= 2
        if (sqrtN * sqrtN == N) numFactor -= 1
        return numFactor
    }
}
