package codility_solution.Lesson16.Greedy_algorithms

object TieRopes {
    fun solution_lesson16_2(K: Int, A: IntArray): Int {
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
