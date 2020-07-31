package codility.solution.lesson13

object Ladder {
    fun solutionLesson13Ver2(A: IntArray, B: IntArray): IntArray {
        var max = 0
        val results = IntArray(A.size)
        // Aの最大値を出しておく。
        A.forEach { max = it.coerceAtLeast(max) }

        val fibonacci = IntArray(max + 1)
        fibonacci[0] = 1
        fibonacci[1] = 1

        (2..max).forEach {
            fibonacci[it] = (fibonacci[it - 1] + fibonacci[it - 2]) % (1 shl 30)
        }

        A.indices.forEach { results[it] = fibonacci[A[it]] % (1 shl B[it])}

        return results
    }
}
