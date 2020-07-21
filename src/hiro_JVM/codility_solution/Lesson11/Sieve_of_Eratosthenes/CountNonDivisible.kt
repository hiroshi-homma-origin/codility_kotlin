package hiro_JVM.codility_solution.Lesson11.Sieve_of_Eratosthenes

import java.util.*

object CountNonDivisible {
    fun solution_lesson11_1(A: IntArray): IntArray {

        val map1 = HashMap<Int, Int>()
        for (aA in A) {
            if (!map1.containsKey(aA)) {
                map1[aA] = 1
            } else {
                map1[aA] = map1[aA]!! + 1
            }
        }

        val map2 = HashMap<Int, Int>()

        for (n in map1.keys) {
            var numDivisors = 0

            val sqrtN = Math.sqrt(n.toDouble()).toInt()
            for (i in 1..sqrtN) {
                if (n % i == 0) {
                    val anotherDivisor = n / i

                    if (map1.containsKey(i)) {
                        numDivisors += map1[i]!!
                    }
                    if (anotherDivisor != i) {
                        if (map1.containsKey(anotherDivisor)) {
                            numDivisors += map1[anotherDivisor]!!
                        }
                    }
                }
            }

            val numNonDivisors = A.size - numDivisors
            map2[n] = numNonDivisors
        }

        val results = IntArray(A.size)
        for (i in A.indices) {
            results[i] = map2[A[i]]!!
        }

        return results
    }
}
