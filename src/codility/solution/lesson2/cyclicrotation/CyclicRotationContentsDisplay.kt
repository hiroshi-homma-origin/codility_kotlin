package codility.solution.lesson2.cyclicrotation

import codility.solution.lesson2.CyclicRotation

object CyclicRotationContentsDisplay {
    @JvmStatic
    fun main(args: Array<String>) {
        //---------------------------- Arrays----------------------------------------- //
        // CyclicRotation (clear)
        println("CyclicRotation")
        println(CyclicRotation.solutionLesson2Ver1(intArrayOf(3, 8, 9, 7, 6), 3).contentToString())
        println(CyclicRotation.solutionLesson2Ver1(intArrayOf(1, 2, 3, 4), 4).contentToString() + "\n------------------")
    }
}