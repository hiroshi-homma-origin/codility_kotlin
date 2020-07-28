package codility.solution.lesson5

object GenomicRangeQuery {
    fun solutionLesson5Ver2(S: String, P: IntArray, Q: IntArray): IntArray {
        val result = IntArray(P.size)

        val a = IntArray(S.length + 1)
        val c = IntArray(S.length + 1)
        val g = IntArray(S.length + 1)
        val t = IntArray(S.length + 1)
        for (i in 0 until S.length) {
            if (S[i] == 'A') {
                a[i + 1] = a[i] + 1
                c[i + 1] = c[i]
                g[i + 1] = g[i]
                t[i + 1] = t[i]
            } else if (S[i] == 'C') {
                a[i + 1] = a[i]
                c[i + 1] = c[i] + 1
                g[i + 1] = g[i]
                t[i + 1] = t[i]
            } else if (S[i] == 'G') {
                a[i + 1] = a[i]
                c[i + 1] = c[i]
                g[i + 1] = g[i] + 1
                t[i + 1] = t[i]
            } else if (S[i] == 'T') {
                a[i + 1] = a[i]
                c[i + 1] = c[i]
                g[i + 1] = g[i]
                t[i + 1] = t[i] + 1
            }
        }

        val num_of_query = P.size
        for (i in 0 until num_of_query) {
            val a = a[Q[i] + 1] - a[P[i]]
            val c = c[Q[i] + 1] - c[P[i]]
            val g = g[Q[i] + 1] - g[P[i]]

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
