package codility.solution.lesson3

//import java.util.*;

object TapeEquilibrium {
    fun solution_lesson3_3(A: IntArray): Int {
        var sum = 0
        var sum_part_one = 0
        var sum_part_two: Int
        var diff: Int
        var min_diff = Integer.MAX_VALUE

        for (aA in A) sum += aA
        for (p in 1 until A.size) {
            sum_part_one += A[p - 1]
            sum_part_two = sum - sum_part_one
            diff = sum_part_one - sum_part_two
            if (diff < 0) diff = -diff
            min_diff = Math.min(min_diff, diff)
        }
        return min_diff
    }
}
