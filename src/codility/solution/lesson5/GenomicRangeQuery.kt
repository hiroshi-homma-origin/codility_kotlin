package codility.solution.lesson5

object GenomicRangeQuery {

    fun solutionLesson5Ver2(S: String, P: IntArray, Q: IntArray): IntArray {
        val genome = Array(3) { IntArray(S.length + 1) }
        val result = IntArray(P.size)

        S.indices.forEach {
            var a = 0
            var c = 0
            var g = 0
            if ('A' == S[it]) a = 1
            if ('C' == S[it]) c = 1
            if ('G' == S[it]) g = 1
            genome[0][it + 1] = genome[0][it] + a
            genome[1][it + 1] = genome[1][it] + c
            genome[2][it + 1] = genome[2][it] + g
        }
        P.indices.forEach {
            when {
                genome[0][Q[it] + 1] - genome[0][P[it]] > 0 -> {
                    result[it] = 1
                }
                genome[1][Q[it] + 1] - genome[1][P[it]] > 0 -> {
                    result[it] = 2
                }
                genome[2][Q[it] + 1] - genome[2][P[it]] > 0 -> {
                    result[it] = 3
                }
                else -> result[it] = 4
            }
        }
        return result
    }
}
