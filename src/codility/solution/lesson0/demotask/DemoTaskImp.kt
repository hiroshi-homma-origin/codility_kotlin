package codility.solution.lesson0.demotask

//---------------------------- Lesson0 DemoTask--------------------------------------- //
import codility.solution.lesson0.DemoTask.solutionDemo // index 1

object DemoTaskImp {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Demo Task")
        println(solutionDemo(intArrayOf(1, 3, 6, 4, 1, 2)).toString() + "\n------------------")
        println(solutionDemo(intArrayOf(1, 2, 3)).toString() + "\n------------------")
        println(solutionDemo(intArrayOf(-1, -2)).toString() + "\n------------------")
    }
}