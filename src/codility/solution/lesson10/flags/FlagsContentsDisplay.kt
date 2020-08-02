package codility.solution.lesson10.flags

import codility.solution.lesson10.Flags

object FlagsContentsDisplay {
    @JvmStatic
    fun main(args: Array<String>) {
        //---------------------------- Prime and composite numbers ------------------------------- //
        println("Flags")
        println(Flags.solutionLesson10Ver2(
                intArrayOf(1, 5, 3, 4, 4, 5, 1, 2, 3, 4, 6, 2)
            ).toString() + "\n------------------"
        )
    }
}