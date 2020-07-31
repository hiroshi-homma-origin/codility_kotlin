package codility.solution.lesson12.commonprimedivisors

import codility.solution.lesson12.CommonPrimeDivisors

//A[0] = 15   B[0] = 75
//A[1] = 10   B[1] = 30
//A[2] = 3    B[2] = 5
object CommonPrimeDivisorsContentsDisplay {
    @JvmStatic
    fun main(args: Array<String>) {
        //---------------------------- Euclidean algorithm ------------------------------- //
        println("CommonPrimeDivisors")
        println(
            CommonPrimeDivisors.solutionLesson12Ver2(
                intArrayOf(15, 10, 3),
                intArrayOf(75, 30, 5)
            ).toString() + "\n------------------"
        )
    }
}