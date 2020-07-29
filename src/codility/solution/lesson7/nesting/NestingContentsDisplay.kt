package codility.solution.lesson7.nesting

import codility.solution.lesson7.Nesting

object NestingContentsDisplay {
    @JvmStatic
    fun main(args: Array<String>) {
        //---------------------------- Stack and Queues------------------------------- //
        println("Nesting")
        println(Nesting.solutionLesson7Ver3("(()(())())").toString() + "\n------------------")
    }
}