package codility.solution.lesson7

// you can also use imports, for example:
import java.util.*

object Brackets {
    fun solutionLesson7Ver1(S: String): Int {
        if (S.isEmpty()) return 1
        val stack = Stack<Char>()
        for (i in S.indices) {
            if (S[i] == '(') {
                stack.push(')')
            } else if (S[i] == '[') {
                stack.push(']')
            } else if (S[i] == '{') {
                stack.push('}')
            } else if (S[i] == ')' || S[i] == ']' || S[i] == '}') {
                if (stack.isEmpty()) {
                    return 0
                } else {
                    val temp = stack.pop()
                    if (temp != S[i]) {
                        return 0
                    }
                }
            }
        }
        return if (!stack.isEmpty()) {
            0
        } else {
            1
        }
    }
}
