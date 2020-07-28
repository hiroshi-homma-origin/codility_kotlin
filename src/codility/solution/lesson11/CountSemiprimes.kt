package codility.solution.lesson11

object CountSemiprimes {
    fun solutionLesson11Ver2(N: Int, P: IntArray, Q: IntArray): IntArray {
        val primes = erastothenesSieve(N)
        val semiPrimes = IntArray(N + 1)

        for (num in 2..N) {
            semiPrimes[num] = semiPrimes[num - 1]
            if (primes[num] != 0) {
                if (primes[num / primes[num]] == 0) {
                    semiPrimes[num]++
                }
            }
        }

        val result = IntArray(P.size)
        for (index in 0 until P.size.coerceAtMost(Q.size)) {
            result[index] = semiPrimes[Q[index]] - semiPrimes[P[index] - 1]
        }
        return result
    }

    private fun erastothenesSieve(N: Int): IntArray {

        val primes = IntArray(N + 1)

        var num = 2
        while (num * num <= N) {
            if (primes[num] == 0) {
                var mul = num * num
                while (mul <= N) {
                    if (primes[mul] == 0) {
                        primes[mul] = num
                    }
                    mul += num
                }
            }
            num++
        }
        return primes
    }
}
