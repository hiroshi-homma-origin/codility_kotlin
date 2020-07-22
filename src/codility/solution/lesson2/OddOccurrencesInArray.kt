package codility.solution.lesson2

object OddOccurrencesInArray {
    fun solutionLesson2Ver2(A: IntArray): Int {
        if (A.isEmpty()) return 0
        var unpaired = A[0]
        A.indices.forEach {
            if(it>0) unpaired = unpaired xor A[it]
        }
        return unpaired
    }
}
