package codility.solution.lesson10

// you can also use imports, for example:
import java.util.*

object Peaks {
    fun solution_lesson10_3(A: IntArray): Int {
        val peaksIndexList = ArrayList<Int>()
        for (i in 1 until A.size - 1) {
            if (A[i - 1] < A[i] && A[i] > A[i + 1]) {
                peaksIndexList.add(i)
            }
        }
        val N = A.size
        for (numBlocks in N downTo 1) {
            if (N % numBlocks == 0) {

                val blockSize = N / numBlocks
                var ithOkBlock = 0

                for (peaksIndex in peaksIndexList) {
                    if (peaksIndex / blockSize == ithOkBlock) {
                        ithOkBlock++
                    }
                }

                if (ithOkBlock == numBlocks) {
                    return numBlocks
                }
            }
        }
        return 0
    }
}
