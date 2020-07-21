package hiro_JVM.codility_solution.Lesson5.Prefix_Sums

object PassingCars {
    fun solution_lesson5_1(A: IntArray): Int {
        var num_east = 0
        var num_pass = 0
        for (aA in A) {
            if (aA == 0) num_east++
            if (aA == 1) num_pass += num_east
        }

        return if (num_pass > 1000000000 || num_pass < 0)
            -1
        else
            num_pass
    }
}
