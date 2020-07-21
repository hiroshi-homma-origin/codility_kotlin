package codility.solution.lesson90

object LongestPassword {
    fun solutionLesson90Ver1(S: String): Int {
        val words = S.replace("\\s+".toRegex(), " ").split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        var maxLength = -1
        for (word in words) {
            if (word.matches("^[0-9a-zA-Z]*$".toRegex()) &&
                    word.replace("[0-9]+".toRegex(), "").length % 2 == 0 &&
                    word.replace("[a-zA-Z]+".toRegex(), "").length % 2 == 1) {
                maxLength = Math.max(maxLength, word.length)
            }
        }
        return maxLength
    }
}
