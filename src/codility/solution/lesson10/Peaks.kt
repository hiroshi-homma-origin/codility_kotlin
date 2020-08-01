package codility.solution.lesson10

// you can also use imports, for example:
import java.util.*

object Peaks {
    fun solutionLesson10Ver3(A: IntArray): Int {
        val peaksIndexList = ArrayList<Int>()
        (1 until A.size - 1).forEach { i ->
            if (A[i - 1] < A[i] && A[i] > A[i + 1]) {
                peaksIndexList.add(i)
            }
        }
        val limit = A.size
        (A.size downTo 1).forEach { numBlocks ->
            if (limit % numBlocks == 0) {

                val blockSize = limit / numBlocks
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
