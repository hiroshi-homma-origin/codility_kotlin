package codility.solution.lesson3

object FrogJmp {
    fun solutionLesson3Ver2(X: Int, Y: Int, D: Int): Int {
        return if ((Y - X) % D != 0) {
            (Y - X) / D + 1
        } else {
            (Y - X) / D
        }
    }
}
