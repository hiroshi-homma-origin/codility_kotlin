package codility.solution.lesson13

object Ladder {
    fun solutionLesson13Ver2(A: IntArray, B: IntArray): IntArray {

        val L = A.size
        var max = 0
        val results = IntArray(L)

        for (aA in A) max = aA.coerceAtLeast(max)
        val fibonacci = IntArray(max + 1)

        fibonacci[0] = 1
        fibonacci[1] = 1

        for (i in 2..max) fibonacci[i] = (fibonacci[i - 1] + fibonacci[i - 2]) % (1 shl 30)

        for (i in 0 until L) results[i] = fibonacci[A[i]] % (1 shl B[i])

        return results
    }
}
