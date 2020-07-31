package codility.solution.lesson16

object TieRopes {
    fun solutionLesson16Ver2(K: Int, A: IntArray): Int {
        var total = 0
        var currentLength = 0
        A.forEach {
            currentLength += it
            if (currentLength >= K) {
                total++
                currentLength = 0
            }
        }
        return total
    }
}
