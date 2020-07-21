package hiro_JVM.codility_solution.Lesson90.Tasks_from_Indeed_Prime_2015_challenge

object LongestPassword {
    fun solution_lesson90_1(S: String): Int {
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
