package codility.solution.lesson3

//import java.util.*;

object PermMissingElem {
    fun solution_lesson3_1(A: IntArray): Int {
        val range = (A.size + 1).toLong()
        val floor: Long = 1
        var missing_num = (range + floor) * range / 2

        for (aA in A) missing_num -= aA
        return missing_num.toInt()
    }
}
