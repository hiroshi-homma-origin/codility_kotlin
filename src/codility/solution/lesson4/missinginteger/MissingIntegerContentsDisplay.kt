package codility.solution.lesson4.missinginteger

import codility.solution.lesson4.MissingInteger

object MissingIntegerContentsDisplay {
    @JvmStatic
    fun main(args: Array<String>) {
        //---------------------------- Counting Elements ----------------------------------------- //
        println("MissingInteger")
        println(MissingInteger.solutionLesson4Ver3(intArrayOf(1, 3, 6, 4, 1, 2)))
        println(MissingInteger.solutionLesson4Ver3(intArrayOf(1, 2, 3)))
        println(MissingInteger.solutionLesson4Ver3(intArrayOf(-1, -3)).toString() + "\n------------------")
    }
}