package codility.solution.lesson10

object MinPerimeterRectangle {
    fun solutionLesson10Ver2(N: Int): Int {
        val sqrtN = Math.sqrt(N.toDouble()).toInt()
        var perimeter = 2 + N * 2
        for (i in sqrtN downTo 1) {
            if (N % i == 0) {
                val B = N / i
                perimeter = i * 2 + B * 2
                break
            }
        }
        return perimeter
    }
}
