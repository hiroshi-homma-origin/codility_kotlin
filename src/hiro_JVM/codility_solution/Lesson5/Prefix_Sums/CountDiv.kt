package hiro_JVM.codility_solution.Lesson5.Prefix_Sums

object CountDiv {
    fun solution_lesson5_4(A: Int, B: Int, K: Int): Int {
        val result1 = B / K
        val result2 = A / K
        val num_B = Math.floor(result1.toDouble()).toInt()
        val num_A = Math.floor(result2.toDouble()).toInt()
        var num_div = num_B - num_A
        var plus = 0
        if (A % K == 0) plus = 1
        num_div += plus
        return num_div
    }
}
