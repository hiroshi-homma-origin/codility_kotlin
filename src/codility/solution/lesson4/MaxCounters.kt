package codility.solution.lesson4

object MaxCounters {
    fun solution_lesson4_3(N: Int, A: IntArray): IntArray {
        var max = 0
        var min = 0
        val my_array = IntArray(N)

        for (aA in A) {
            if (aA in 1..N) {
                if (my_array[aA - 1] < min) {
                    my_array[aA - 1] = min
                }
                my_array[aA - 1]++
                if (my_array[aA - 1] > max) {
                    max = my_array[aA - 1]
                }
            } else if (aA == N + 1) {
                min = max
            }
        }

        for (i in my_array.indices) {
            if (my_array[i] < min) {
                my_array[i] = min // update it to "min"
            }
        }

        return my_array
    }
}
