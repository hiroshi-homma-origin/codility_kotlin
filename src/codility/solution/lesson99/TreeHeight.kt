package codility.solution.lesson99

import codility.solution.model.Tree

object TreeHeight {
    fun solutionLesson99Ver2(T: Tree?): Int {
        return if (T == null) -1 else 1 + Math.max(
            solutionLesson99Ver2(T.l),
            solutionLesson99Ver2(T.r)
        )
    }
}
