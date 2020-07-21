package codility.solution.lesson1

//import java.util.*;

object BinaryGap {
    fun solutionLesson1Ver1(N: Int): Int {
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
