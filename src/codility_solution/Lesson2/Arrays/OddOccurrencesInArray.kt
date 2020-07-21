package codility_solution.Lesson2.Arrays

object OddOccurrencesInArray {
    fun solution_lesson2_2(A: IntArray): Int {
        if (A.size == 0) return 0
        var unpaired: Int
        unpaired = A[0] // initial
        for (i in 1 until A.size) unpaired = unpaired xor A[i]

        return unpaired
    }
}
