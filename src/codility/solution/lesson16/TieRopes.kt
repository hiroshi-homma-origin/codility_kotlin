package codility.solution.lesson16

object TieRopes {
    fun solutionLesson16Ver2(K: Int, A: IntArray): Int {
        var total = 0
        var currentLength = 0
        for (aA in A) {
            currentLength += aA
            if (currentLength >= K) {
                total++
                currentLength = 0
            }
        }
        return total
    }
}
