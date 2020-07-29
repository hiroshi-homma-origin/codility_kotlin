package codility.solution.lesson7

// you can also use imports, for example:
import java.util.*

object Nesting {
    fun solutionLesson7Ver3(S: String): Int {
        val stack = Stack<Char>()
        for (i in S.indices) {
            when (S[i]) {
                '(' -> stack.push(S[i])
                ')' -> if (stack.isEmpty() || stack.peek() != '(') return 0 else stack.pop()
            }
        }
        return if (stack.isEmpty()) 1 else 0
    }
}
