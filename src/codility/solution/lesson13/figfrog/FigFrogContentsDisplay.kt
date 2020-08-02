package codility.solution.lesson13.figfrog

import codility.solution.lesson13.FibFrog

object FigFrogContentsDisplay {
    @JvmStatic
    fun main(args: Array<String>) {
        //---------------------------- Fibonacci numbers ------------------------------- //
        println("FibFrog")
        println(
            FibFrog.solutionLesson13Ver1(
                intArrayOf(0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0)
            ).toString() + "\n------------------"
        )
    }
}