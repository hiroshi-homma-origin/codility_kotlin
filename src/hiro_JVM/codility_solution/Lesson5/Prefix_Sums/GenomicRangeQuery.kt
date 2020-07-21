package hiro_JVM.codility_solution.Lesson5.Prefix_Sums

object GenomicRangeQuery {
    fun solution_lesson5_2(S: String, P: IntArray, Q: IntArray): IntArray {
        val result = IntArray(P.size)

        val A = IntArray(S.length + 1)
        val C = IntArray(S.length + 1)
        val G = IntArray(S.length + 1)
        val T = IntArray(S.length + 1)
        for (i in 0 until S.length) {
            if (S[i] == 'A') {
                A[i + 1] = A[i] + 1
                C[i + 1] = C[i]
                G[i + 1] = G[i]
                T[i + 1] = T[i]
            } else if (S[i] == 'C') {
                A[i + 1] = A[i]
                C[i + 1] = C[i] + 1
                G[i + 1] = G[i]
                T[i + 1] = T[i]
            } else if (S[i] == 'G') {
                A[i + 1] = A[i]
                C[i + 1] = C[i]
                G[i + 1] = G[i] + 1
                T[i + 1] = T[i]
            } else if (S[i] == 'T') {
                A[i + 1] = A[i]
                C[i + 1] = C[i]
                G[i + 1] = G[i]
                T[i + 1] = T[i] + 1
            }
        }

        val num_of_query = P.size
        for (i in 0 until num_of_query) {
            val a = A[Q[i] + 1] - A[P[i]]
            val c = C[Q[i] + 1] - C[P[i]]
            val g = G[Q[i] + 1] - G[P[i]]

            if (a > 0) {
                result[i] = 1
            } else if (c > 0) {
                result[i] = 2
            } else if (g > 0) {
                result[i] = 3
            } else {
                result[i] = 4
            }
        }

        return result
    }
}
