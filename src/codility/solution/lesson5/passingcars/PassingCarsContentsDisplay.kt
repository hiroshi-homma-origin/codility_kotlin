package codility.solution.lesson5.passingcars

import codility.solution.lesson5.PassingCars

object PassingCarsContentsDisplay {
    @JvmStatic
    fun main(args: Array<String>) {
        //---------------------------- Prefix Sums ----------------------------------------- //
        println("PassingCars")
        println(PassingCars.solutionLesson5Ver4(intArrayOf(0, 1, 0, 1, 1)).toString() + "\n------------------")
    }
}