package codility.solution.lesson15.minabssumoftwo

import codility.solution.lesson15.MinAbsSumOfTwo

object MinAbsSumOfTwoContentsDisplay {
    @JvmStatic
    fun main(args: Array<String>) {
        //---------------------------- Caterpillar method ------------------------------- //
        println("MinAbsSumOfTwo")
        println(MinAbsSumOfTwo.solutionLesson15Ver4(intArrayOf(1, 4, -3)))
        println(MinAbsSumOfTwo.solutionLesson15Ver4(intArrayOf(-8, 4, 5, -10, 3)).toString() + "\n------------------")
    }
}