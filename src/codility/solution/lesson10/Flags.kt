package codility.solution.lesson10

object Flags {
    fun solution_lesson10_4(A: IntArray): Int {
        if (A.size < 3) return 0

        val nexts = IntArray(A.size)
        var next = A.size
        nexts[A.size - 1] = A.size
        var peaks = 0
        for (i in A.size - 2 downTo 1) {
            if (A[i - 1] < A[i] && A[i] > A[i + 1]) {
                next = i
                peaks++
            }
            nexts[i] = next
        }
        nexts[0] = next

        if (peaks == 0) return 0

        var result = 1
        val start = nexts[0]
        var p = 1
        var maxp = 1

        while (maxp * maxp <= A.size) maxp++

        if (maxp * maxp != A.size) maxp++

        if (peaks < maxp) maxp = peaks

        while (p <= maxp) {
            var setFlags = 0
            var j = start
            while (setFlags < p && j < A.size) {
                setFlags++
                j = if (j + p < nexts.size) nexts[j + p] else A.size
            }
            if (result < setFlags) {
                result = setFlags
            }
            p++
        }
        return result
    }
}
