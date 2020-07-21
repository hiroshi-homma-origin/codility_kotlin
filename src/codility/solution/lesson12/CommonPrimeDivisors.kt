package codility.solution.lesson12

object CommonPrimeDivisors {
    fun solutionLesson12Ver2(A: IntArray, B: IntArray): Int {
        var c = 0
        for (i in A.indices) {
            if (A[i] == 1 && B[i] == 1) {
                c++
                continue
            }
            val g = gcm(A[i], B[i])
            var m = A[i] / g
            var gcm = g
            var containsA = false

            while (true) {
                if (gcm % m == 0) {
                    containsA = true
                    break
                } else {
                    val newG = gcm(gcm, m)
                    if (newG == 1) {
                        break
                    }
                    m /= newG
                    gcm = newG
                }
            }
            m = B[i] / g
            gcm = g
            var containsB = false
            while (true) {
                if (gcm % m == 0) {
                    containsB = true
                    break
                } else {
                    val newG = gcm(gcm, m)
                    if (newG == 1) {
                        break
                    }
                    m /= newG
                    gcm = newG
                }
            }
            if (containsA && containsB) {
                c++
            }
        }
        return c
    }

    private fun gcm(a: Int, b: Int): Int {
        return if (a % b == 0) {
            b
        } else {
            gcm(b, a % b)
        }
    }
}
