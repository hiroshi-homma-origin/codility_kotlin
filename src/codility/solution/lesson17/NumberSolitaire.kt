package codility.solution.lesson17

object NumberSolitaire {
    fun solutionLesson17Ver2(A: IntArray): Int {
        val trial = IntArray(A.size) { A[0] }
        (1 until A.size).forEach { index ->
            var max = Integer.MIN_VALUE
            // Throw the dice
            (1..6).forEach { dice ->
                // current number set
                val current = index - dice
                if (current >= 0) {
                    max = (trial[current] + A[index]).coerceAtLeast(max)
                }
            }
            trial[index] = max
        }
        return trial[A.size - 1]
    }
}
