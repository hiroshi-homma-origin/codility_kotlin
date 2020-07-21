package codility_solution.Lesson13.Fibonacci_numbers


object Ladder {
    fun solution_lesson13_2(A: IntArray, B: IntArray): IntArray {

        val L = A.size
        var max = 0
        val results = IntArray(L)

        for (aA in A) max = Math.max(aA, max)
        val fibonacci = IntArray(max + 1)

        fibonacci[0] = 1
        fibonacci[1] = 1

        for (i in 2..max) fibonacci[i] = (fibonacci[i - 1] + fibonacci[i - 2]) % (1 shl 30)

        for (i in 0 until L) results[i] = fibonacci[A[i]] % (1 shl B[i])

        return results
    }
}
