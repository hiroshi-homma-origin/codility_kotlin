package hiro_JVM.codility_solution.Lesson12.Euclidean_algorithm

object ChocolatesByNumbers {
    fun solution_lesson12_1(N: Int, M: Int): Int {
        return N / gcd(N, M)
    }

    private fun gcd(a: Int, b: Int): Int {
        return if (a % b == 0) b else gcd(b, a % b)
    }
}
