package codility.solution.lesson14.minmaxdivision

import codility.solution.lesson14.MinMaxDivision

object MinMaxDivisionContentsDisplay {
    @JvmStatic
    fun main(args: Array<String>) {
        //---------------------------- Binary search algorithm ------------------------------- //
        println("MinMaxDivision")
        println(MinMaxDivision.solutionLesson14Ver1(
            3, intArrayOf(2, 1, 5, 1, 2, 2, 2)
        ).toString() + "\n------------------")
    }
}