package codility.solution.lesson5

object PassingCars {
    fun solutionLesson5Ver1(A: IntArray): Int {
        var numEast = 0
        var numPass = 0
        for (aA in A) {
            if (aA == 0) numEast++
            if (aA == 1) numPass += numEast
        }

        return if (numPass > 1000000000 || numPass < 0) -1 else numPass
    }
}
