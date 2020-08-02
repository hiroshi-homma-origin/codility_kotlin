package codility.solution.lesson10.peaks

import codility.solution.lesson10.Peaks

object PeaksContentsDisplay {
    @JvmStatic
    fun main(args: Array<String>) {
        //---------------------------- Prime and composite numbers ------------------------------- //
        println("Peaks")
        println(Peaks.solutionLesson10Ver4(
                intArrayOf(1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2)
            ).toString() + "\n------------------"
        )
    }
}