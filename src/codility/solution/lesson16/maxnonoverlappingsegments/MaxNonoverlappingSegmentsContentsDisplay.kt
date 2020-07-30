package codility.solution.lesson16.maxnonoverlappingsegments

import codility.solution.lesson16.MaxNonoverlappingSegments

object MaxNonverlappingSegmentsContentsDisplay {
    @JvmStatic
    fun main(args: Array<String>) {
        //---------------------------- Greedy algorithms ------------------------------- //
        println("MaxNonoverlappingSegments")
        println(MaxNonoverlappingSegments.solutionLesson16Ver1(intArrayOf(1, 3, 7, 9, 9), intArrayOf(5, 6, 8, 9, 10)).toString() + "\n------------------")
    }
}