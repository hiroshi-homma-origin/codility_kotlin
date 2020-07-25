package codility.solution.lesson0.demotask

import codility.solution.lesson0.DemoTask.solutionDemo // index 1

object DemoTaskContentsDisplay {
    @JvmStatic
    fun main(args: Array<String>) {
        //---------------------------- Lesson0 DemoTask--------------------------------------- //
        println("Demo Task")
        println(solutionDemo(intArrayOf(1, 3, 6, 4, 1, 2)).toString() + "\n------------------")
        println(solutionDemo(intArrayOf(1, 2, 3)).toString() + "\n------------------")
        println(solutionDemo(intArrayOf(-1, -2)).toString() + "\n------------------")
    }
}