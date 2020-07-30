package codility.solution.lesson11.countnondivisible

import codility.solution.lesson11.CountNonDivisible

object CountNonDivisibleContentsDisplay {
    @JvmStatic
    fun main(args: Array<String>) {
        //---------------------------- Sieve of Eratosthenes ------------------------------- //
        println("CountNonDivisible")
        println(CountNonDivisible.solutionLesson11Ver1(intArrayOf(3, 1, 2, 3, 6)).contentToString() + "\n------------------")
    }
}