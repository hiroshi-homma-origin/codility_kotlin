package codility.solution.lesson90

object FloodDepth {
    fun solutionLesson90Ver2(A: IntArray): Int {
        var maxDepth = 0
        var beginHeight = 0
        var lowestHeight = 0
        A.forEach {
            when {
                it < lowestHeight -> lowestHeight = it
                it < beginHeight -> maxDepth = maxDepth.coerceAtLeast(it - lowestHeight)
                else -> {
                    maxDepth = maxDepth.coerceAtLeast(beginHeight - lowestHeight)
                    beginHeight = it
                    lowestHeight = it
                }
            }
        }
        return maxDepth
    }
}
