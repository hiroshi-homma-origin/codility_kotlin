package codility.solution.lessontraining

object TrainingTask {
    fun solutionTraining(A: IntArray): Int {
        val temp = HashSet<Int>()
        var result = 0
        A.forEachIndexed { i,value->
            if (!temp.contains(value)) {
                temp.add(value)
                result = i
            }
        }
        return result
    }
}
