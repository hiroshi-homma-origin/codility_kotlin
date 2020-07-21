package codility_solution.Lesson99.Future_training

import codility_solution.model.Tree

object TreeHeight {
    fun solution_lesson99_2(T: Tree?): Int {
        return if (T == null) -1 else 1 + Math.max(solution_lesson99_2(T.l), solution_lesson99_2(T.r))
    }
}
