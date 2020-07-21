package codility.solution.lesson90

object FloodDepth {
    fun solutionLesson90Ver2(A: IntArray): Int {
        var maxDepth = 0
        var beginHeight = 0
        var lowestHeight = 0
//        val height: Int
        for (aA in A) {
            when {
                aA < lowestHeight -> lowestHeight = aA
                aA < beginHeight -> maxDepth = Math.max(maxDepth, aA - lowestHeight)
                else -> {
                    maxDepth = Math.max(maxDepth, beginHeight - lowestHeight)
                    beginHeight = aA
                    lowestHeight = aA
                }
            }
        }
        return maxDepth
    }
}
