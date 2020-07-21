package hiro_JVM.codility_solution.Lesson10.Prime_and_composite_numbers

object MinPerimeterRectangle {
    fun solution_lesson10_2(N: Int): Int {
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
