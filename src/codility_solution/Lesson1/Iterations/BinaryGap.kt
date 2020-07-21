package codility_solution.Lesson1.Iterations

//import java.util.*;

object BinaryGap {
    fun solution_lesson1_1(N: Int): Int {
        var n = N
        var binaryGap = 0
        var found_one = false
        var i = 0
        while (n > i) {
            if (n % 2 == 0) {
                i++
            } else {
                if (i > binaryGap && found_one) {
                    binaryGap = i
                }
                found_one = true
                i = 0
            }
            n /= 2
        }
        return binaryGap
    }
}
