package codility.solution.lesson1

object BinaryGap {
    fun solutionLesson1Ver1(N: Int): Int {
        val binary = Integer.toBinaryString(N)
        var count = 0
        var tmpCount = 0
        for (i in Integer.toBinaryString(N).indices) {
            if (binary[i] == '0') {
                if (i > 0 && binary[i - 1] == '1') {
                    tmpCount++
                } else {
                    if (tmpCount > 0) tmpCount++
                }
            } else if (binary[i] == '1') {
                if (tmpCount > 0 && tmpCount > count) {
                    count = tmpCount
                }
                tmpCount = 0
            }
        }
        return count
    }

    fun otherSolutionLesson1Ver1(N: Int): Int {
        val binaryNumber = Integer.toBinaryString(N)
        var maxLength = 0
        val gaps = binaryNumber.replace("0+$".toRegex(), "")
            .split("1".toRegex()).toTypedArray()
        for (gap in gaps) {
            if (gap.isNotEmpty() && gap.length > maxLength) {
                maxLength = gap.length
            }
        }
        return maxLength
    }
}
