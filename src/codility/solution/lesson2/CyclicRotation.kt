package codility.solution.lesson2

object CyclicRotation {
    fun solutionLesson2Ver1(A: IntArray, K: Int): IntArray {
        val newArray = IntArray(A.size)
        A.indices.map {
            val newPosition = (it + K) % A.size
            newArray[newPosition] = A[it]
        }
        return newArray
    }
}
