package codility.solution.lesson92

object TennisTournament {
    fun solutionLesson92Ver1(P: Int, C: Int): Int {
        return (P / 2).coerceAtMost(C)
    }
}
