package hiro_JVM.codility_solution.Lesson91.Tasks_from_Indeed_Prime_2016_challenge

import java.util.stream.IntStream

object DwarfsRafting {
    private var dwarfs: IntArray? = null
    private var capacity: IntArray? = null
    fun solution_lesson91_2(N: Int, S: String, T: String): Int {
        var s = S
        var t = T
        if (N % 2 == 1) {
            return -1
        }
        s = s.toLowerCase()
        t = t.toLowerCase()
        val barrels = parseString(s, N)
        dwarfs = parseString(t, N)
        capacity = IntArray(4)
        for (i in barrels.indices) {
            capacity!![i] = N * N / 4 - barrels[i]
        }
        val diagonal = getBalanced(0, 3)
        val antiDiagonal = getBalanced(1, 2)
        return if (diagonal < 0 || antiDiagonal < 0) {
            -1
        } else diagonal + antiDiagonal - IntStream.of(*dwarfs!!).sum()
    }

    private fun charToInt(letter: Char): Int {
        return letter - 'a'
    }

    private fun getBalanced(left: Int, right: Int): Int {
        val balance = Math.min(capacity!![left], capacity!![right])
        return if (balance < Math.max(dwarfs!![left], dwarfs!![right])) {
            -1
        } else {
            balance * 2
        }
    }

    private fun parseString(`in`: String, N: Int): IntArray {
        if (`in`.isEmpty()) {
            return IntArray(4)
        }
        val data = IntArray(4)
        val chunks = `in`.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        for (chunk in chunks) {
            val column = Integer.parseInt(chunk.substring(0, chunk.length - 1))
            val row = charToInt(chunk[chunk.length - 1])
            if (column <= N / 2) {
                if (row < N / 2) {
                    data[0]++
                } else {
                    data[1]++
                }
            } else {
                if (row < N / 2) {
                    data[2]++
                } else {
                    data[3]++
                }
            }
        }
        return data
    }

}
