package codility.solution.lesson11.countsemiprimes

import codility.solution.lesson11.CountSemiprimes

object CountSemiprimesContentsDisplay {
    @JvmStatic
    fun main(args: Array<String>) {
        //---------------------------- Fibonacci numbers ------------------------------- //
        println("CountSemiprimes")
        println(
            CountSemiprimes.solutionLesson11Ver2(
                26,
                intArrayOf(1, 4, 16),
                intArrayOf(26, 10, 20)
            ).contentToString() + "\n------------------"
        )
    }
}