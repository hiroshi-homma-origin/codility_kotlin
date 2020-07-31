package codility.solution.lesson14.nailingplanks

import codility.solution.lesson14.NailingPlanks

object NailingPlanksContentsDisplay {
    @JvmStatic
    fun main(args: Array<String>) {
        //---------------------------- Binary search algorithm ------------------------------- //
        println("NailingPlanks")
        println(
            NailingPlanks.solutionLesson14Ver2(
                intArrayOf(1, 4, 5, 8),
                intArrayOf(4, 5, 9, 10),
                intArrayOf(4, 6, 7, 10, 2)
            ).toString() + "\n------------------"
        )
    }
}