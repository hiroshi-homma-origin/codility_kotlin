package codility.solution.lesson1.binaryGap

import codility.solution.lesson1.BinaryGap

object DemoTaskContentsDisplay {
    @JvmStatic
    fun main(args: Array<String>) {
        println("BinaryGap")
        println(BinaryGap.solutionLesson1Ver1(1041))
        println(BinaryGap.solutionLesson1Ver1(15))
        println(BinaryGap.solutionLesson1Ver1(32).toString() + "\n------------------")
        println("BinaryGapOther1")
        println(BinaryGap.otherSolutionLesson1Ver1(1041))
        println(BinaryGap.otherSolutionLesson1Ver1(15))
        println(BinaryGap.otherSolutionLesson1Ver1(32).toString() + "\n------------------")
    }
}