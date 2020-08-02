package codility.solution.lesson13.ladder

import codility.solution.lesson13.Ladder

object LadderContentsDisplay {
    @JvmStatic
    fun main(args: Array<String>) {
        //---------------------------- Fibonacci numbers ------------------------------- //
        println("Ladder")
        println(
            Ladder.solutionLesson13Ver2(
                intArrayOf(4, 4, 5, 5, 1),
                intArrayOf(3, 2, 4, 3, 1)
            ).contentToString() + "\n------------------"
        )
    }
}