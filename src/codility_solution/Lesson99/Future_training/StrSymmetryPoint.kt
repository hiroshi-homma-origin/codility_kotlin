package codility_solution.Lesson99.Future_training

object StrSymmetryPoint {
    fun solution_lesson99_1(S: String): Int {
        val length = S.length
        return if (length % 2 != 0 && isPalindrome(S)) {
            length / 2
        } else {
            -1
        }
    }

    private fun isPalindrome(S: String): Boolean {
        var i = 0
        var j = S.length - 1
        while (i < j) {
            if (S[i] != S[j]) {
                return false
            }
            i++
            j--
        }
        return true
    }
}
