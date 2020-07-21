package codility_solution.Lesson99.Future_training

import codility_solution.model.Point2D

object PolygonConcavityIndex {
    fun solution_lesson99_4(A: Array<Point2D>): Int {
        // write your code in Java SE 8
        val directions = IntArray(A.size)
        var arbiter = 0
        for (i in A.indices) {
            directions[i] = direction(A[(i - 1 + A.size) % A.size], A[i], A[(i + 1) % A.size])
            if (directions[i] != 0 && A[i].y <= A[arbiter].y) {
                arbiter = i
            }
        }
        for (i in A.indices) {
            if (directions[arbiter] * directions[i] < 0) {
                return i
            }
        }
        return -1
    }

    private fun direction(a: Point2D, b: Point2D, c: Point2D): Int {
        val scale = (b.x.toLong() - a.x.toLong()) * (c.y.toLong() - b.y.toLong()) - (c.x.toLong() - b.x.toLong()) * (b.y.toLong() - a.y.toLong())
        return if (0 < scale) 1 else if (scale < 0) -1 else 0
    }
}
