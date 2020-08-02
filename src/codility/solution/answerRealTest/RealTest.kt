package codility.solution.answerRealTest

import codility.solution.model.Tree
import java.util.*

object RealTest {
@JvmStatic
fun main(args: Array<String>) {
    //---------------------------- Line Real Test ---------------------------- //
    println("question1\n"+
            solution1("test 5 a0A pass007 ?xy1").toString() +
            "\n------------------")
    println("question1_1\n"+
            solution1to1("{[()()]}").toString() +
            "\n------------------")
    println("question2\n"+
            solution2(intArrayOf(10, 2, 5, 8, 1, 12)).toString() +
            "\n------------------")
    println("question3\n"+
            solution3(intArrayOf(3, 8, 9, 7, 6), 3).contentToString() +
            "\n------------------")
    println("question4\n"+
            solution4("CAGCCTA", intArrayOf(2, 5, 0), intArrayOf(4, 5, 6)).contentToString() +
            "\n------------------")
    println("question5\n"+
            solution4("CAGCCTA", intArrayOf(2, 5, 0), intArrayOf(4, 5, 6)).contentToString() +
            "\n------------------")
}

// Question 1
private fun solution1(S: String): Int {
    val words = S.replace("\\s+".toRegex(), " ").split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
    var maxLength = -1
    words.forEach { word ->
        if (word.matches("^[0-9a-zA-Z]*$".toRegex()) &&
            word.replace("[0-9]+".toRegex(), "").length % 2 == 0 &&
            word.replace("[a-zA-Z]+".toRegex(), "").length % 2 == 1) {
            maxLength = Math.max(maxLength, word.length)
        }
    }
    return maxLength
}
private fun solution1to1(S: String): Int {
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
// Question 2
private fun solution2(A: IntArray): Int {
    A.sort()
    var result = 0
    (A.indices).forEach { p ->
        var q: Int = p + 1
        var r: Int = p + 2
        while (r < A.size) {
            when {
                A[p] + A[q] > A[r] -> {
                    result += r - q
                    r++
                }
                r == q -> r++
                else -> q++
            }
        }
    }
    return result
}

// Question 3
private fun solution3(A: IntArray, K: Int): IntArray {
    val newArray = IntArray(A.size)
    A.indices.map {
        val newPosition = (it + K) % A.size
        newArray[newPosition] = A[it]
    }
    return newArray
}

// Question 4
private fun solution4(S: String, P: IntArray, Q: IntArray): IntArray {
    val genome = Array(3) { IntArray(S.length + 1) }
    val result = IntArray(P.size)

    S.indices.forEach {
        var a = 0
        var c = 0
        var g = 0
        if ('A' == S[it]) a = 1
        if ('C' == S[it]) c = 1
        if ('G' == S[it]) g = 1
        genome[0][it + 1] = genome[0][it] + a
        genome[1][it + 1] = genome[1][it] + c
        genome[2][it + 1] = genome[2][it] + g
    }
    P.indices.forEach {
        when {
            genome[0][Q[it] + 1] - genome[0][P[it]] > 0 -> {
                result[it] = 1
            }
            genome[1][Q[it] + 1] - genome[1][P[it]] > 0 -> {
                result[it] = 2
            }
            genome[2][Q[it] + 1] - genome[2][P[it]] > 0 -> {
                result[it] = 3
            }
            else -> result[it] = 4
        }
    }
    return result
}

private fun tree(x: Int, l: Tree?, r: Tree?): Tree {
    val tree = Tree()
    tree.x = x
    tree.l = l
    tree.r = r
    return tree
}

}
