package codility.solution.lesson3

//import java.util.*;

object FrogJmp {
    fun solutionLesson3Ver2(X: Int, Y: Int, D: Int): Int {
        val difference = (Y - X).toLong()
        var plus: Long = 0
        if (difference % D != 0L) plus = 1
        var result: Long
        result = difference / D
        result += plus
        return result.toInt()
    }
}
