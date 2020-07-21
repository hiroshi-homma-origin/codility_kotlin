package codility.solution.lesson2

object CyclicRotation {
    fun solution_lesson2_1(A: IntArray, K: Int): IntArray {
        val new_array = IntArray(A.size) // a new array
        for (i in A.indices) {
            val new_position = (i + K) % A.size // using "mod" to do Cyclic Rotation
            new_array[new_position] = A[i] // put A[i] to the new position
        }
        return new_array
    }
}
