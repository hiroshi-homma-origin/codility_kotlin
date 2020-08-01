package codility.solution.lesson5

object PassingCars {
    fun solutionLesson5Ver4(A: IntArray): Int {
        var numEast = 0
        var numPass = 0
        A.forEach {
            if (it == 0) numEast++
            if (it == 1) numPass += numEast
        }

        return if (numPass > 1000000000 || numPass < 0) -1 else numPass
    }
}
