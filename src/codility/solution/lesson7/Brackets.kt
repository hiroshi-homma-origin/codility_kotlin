package codility.solution.lesson7

import java.util.*

object Brackets {
    fun solutionLesson7Ver1(S: String): Int {
        val stack = Stack<Char>()
        S.indices.forEach { i->
            when (S[i]) {
                ')' -> if (stack.isEmpty() || stack.pop() != '(') return 0
                ']' -> if (stack.isEmpty() || stack.pop() != '[') return 0
                '}' -> if (stack.isEmpty() || stack.pop() != '{') return 0
                else -> stack.push(S[i])
            }
        }
        return if (stack.isEmpty()) 1 else 0
    }
}
