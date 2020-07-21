package codility.solution.lessontraining

import java.util.*

object TrainingTask {
    private val indexes: MutableMap<Int, Int> = HashMap()
    private var highestIndex = 0
    fun solutionTraining(A: IntArray): Int {
        for (i in A.size - 1 downTo 0) { indexes[A[i]] = i }
        indexes.values.forEach { if (highestIndex < it) highestIndex = it }
        return highestIndex
    }
}
