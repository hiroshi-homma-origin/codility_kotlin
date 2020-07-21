package codility.solution.lesson12

object ChocolatesByNumbers {
    fun solutionLesson12Ver1(N: Int, M: Int): Int {
        return N / gcd(N, M)
    }

    private fun gcd(a: Int, b: Int): Int {
        return if (a % b == 0) b else gcd(b, a % b)
    }
}
