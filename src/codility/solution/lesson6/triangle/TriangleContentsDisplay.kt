package codility.solution.lesson6.triangle

import codility.solution.lesson6.Triangle

object TriangleContentsDisplay {
    @JvmStatic
    fun main(args: Array<String>) {
        //---------------------------- Sorting ----------------------------------------- //
        println("NumberOfDiscIntersections")
        println(Triangle.solutionLesson6Ver4(intArrayOf(10, 2, 5, 1, 8, 20)).toString() + "\n------------------")
        println(Triangle.solutionLesson6Ver4(intArrayOf(10, 50, 5, 1)).toString() + "\n------------------")
    }
}