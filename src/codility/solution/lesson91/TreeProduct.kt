package codility.solution.lesson91

import java.util.*

object TreeProduct {
    fun solutionLesson91Ver4(A: IntArray, B: IntArray): String {

        var a_b_search: Long
        var b_b_search: Long
        var i = 0
        var k = 0
        var temp: Int
        var result = 1
        var decide = 1

        for (aA in A) {
            i++
            a_b_search = Arrays.binarySearch(B, aA).toLong()
            if (i > 1 && a_b_search < 0) {
                k++
                temp = B[i - 1]
                B[i - 1] = A[i - 1]
                A[i - 1] = temp
            }
        }
        A[0] = 1
        B[0] = 0
        println("k:$k,\t")
        println("入れ替え後:" + Arrays.toString(A))
        println("入れ替え後:" + Arrays.toString(B))

        // 共通の
        for (j in 1 until B.size) {

            if (A[j] != A[j - 1]) {
                decide = decide * result
                println("計算:$decide")
                result = 1
            } else {
                result++
            }

            b_b_search = Arrays.binarySearch(A, B[j]).toLong()
            if (b_b_search > 0) {
                k++
                println("k:$k,\t")
            }
        }

        if (k > 2) {
            println("\n--- answer1 ----")
            decide = decide * (result + 1)
            return decide.toString()
        } else if (k == 2) {
            println("\n--- answer2 ----")
            decide = decide * (result + 1) + k
            return decide.toString()
        } else {
            println("\n--- answer3 ----")
            return (result + 1).toString()
        }
    }
}
