package codility.solution.lesson4

object MaxCounters {
    fun solutionLesson4Ver2(N: Int, A: IntArray): IntArray {
        var max = 0
        var min = 0
        val myArray = IntArray(N)

        A.forEach {
            if (it == N + 1) {
                min = max
            } else {
                if (myArray[it - 1] < min) myArray[it - 1] = min
                myArray[it - 1]++
                if (myArray[it - 1] > max) max = myArray[it - 1]
            }
        }
        myArray.indices.forEach {
            if (myArray[it] < min) myArray[it] = min
        }
        return myArray
    }
}
