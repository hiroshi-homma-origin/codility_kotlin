package codility.solution.lesson17.numbersolitaire

import codility.solution.lesson17.NumberSolitaire

object MaxNonverlappingSegmentsContentsDisplay {
    @JvmStatic
    fun main(args: Array<String>) {
        //---------------------------- Dynamic programming ------------------------------- //
        println("NumberSolitaire")
        println(NumberSolitaire.solutionLesson17Ver2(intArrayOf(1, -2, 0, 9, -1, -2)).toString() + "\n------------------")
    }
}