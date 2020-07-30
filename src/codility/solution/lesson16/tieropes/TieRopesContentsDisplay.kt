package codility.solution.lesson16.tieropes

import codility.solution.lesson16.TieRopes

object MaxNonverlappingSegmentsContentsDisplay {
    @JvmStatic
    fun main(args: Array<String>) {
        //---------------------------- Greedy algorithms ------------------------------- //
        println("TieRopes")
        println(TieRopes.solutionLesson16Ver2(4, intArrayOf(1, 2, 3, 4, 1, 1, 3)).toString() + "\n------------------")
    }
}