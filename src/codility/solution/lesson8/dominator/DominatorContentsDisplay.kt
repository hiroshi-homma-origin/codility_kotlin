package codility.solution.lesson8.dominator

import codility.solution.lesson8.Dominator

object DominatorContentsDisplay {
    @JvmStatic
    fun main(args: Array<String>) {
        //---------------------------- Leader ------------------------------- //
        println("Dominator")
        println(Dominator.solutionLesson8Ver1(intArrayOf(3, 4, 3, 2, 3, -1, 3, 3)).toString() + "\n------------------")
    }
}