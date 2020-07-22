package codility.solution.lesson1

object BinaryGap {
    fun solutionLesson1Ver1(N: Int): Int {
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
