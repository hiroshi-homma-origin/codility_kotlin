package codility.solution.execution

import codility.solution.model.Point2D
import codility.solution.model.Tree
//---------------------------- Lesson15 Caterpillar method----------------------------- //
import codility.solution.lesson15.AbsDistinct.solutionLesson15Ver1 // index 42
import codility.solution.lesson15.CountDistinctSlices.solutionLesson15Ver2 // index 43
import codility.solution.lesson15.CountTriangles.solutionLesson15Ver3 // index 44
import codility.solution.lesson15.MinAbsSumOfTwo.solutionLesson15Ver4 // index 45
//---------------------------- Lesson16 Greedy algorithms------------------------------ //
import codility.solution.lesson16.MaxNonoverlappingSegments.solutionLesson16Ver1 // index 46
import codility.solution.lesson16.TieRopes.solutionLesson16Ver2 // index 47
//---------------------------- Lesson17 Dynamic programming---------------------------- //
import codility.solution.lesson17.NumberSolitaire.solutionLesson17Ver1 // index 48
import codility.solution.lesson17.MinAbsSum.solutionLesson17Ver2 // index 49
import codility.solution.lesson9.MaxDoubleSliceSum
//---------------------------- Lesson90 Tasks from Indeed Prime 2015 challenge---------------------------- //
import codility.solution.lesson90.LongestPassword.solutionLesson90Ver1 // index 50
import codility.solution.lesson90.FloodDepth.solutionLesson90Ver2 // index 51
import codility.solution.lesson90.SlalomSkiing.solutionLesson90Ver3 // index 52
//---------------------------- Lesson91 Tasks from Indeed Prime 2016 challenge---------------------------- //
import codility.solution.lesson91.RectangleBuilderGreaterArea.solutionLesson91Ver1 // index 53
import codility.solution.lesson91.DwarfsRafting.solutionLesson91Ver2 // index 54
import codility.solution.lesson91.HilbertMaze.solutionLesson91Ver3 // index 55
import codility.solution.lesson91.TreeProduct.solutionLesson91Ver4 // index 56
//---------------------------- Lesson92 Tasks from Indeed Prime 2016 College Coders challenge---------------------------- //
import codility.solution.lesson92.TennisTournament.solutionLesson92Ver1 // index 57
import codility.solution.lesson92.SocksLaundering.solutionLesson92Ver2 // index 58
import codility.solution.lesson92.ArrayRecovery.solutionLesson92Ver3 // index 59
//---------------------------- Lesson99 Future training ---------------------------- //
import codility.solution.lesson99.StrSymmetryPoint.solutionLesson99Ver1 // index 61
import codility.solution.lesson99.TreeHeight.solutionLesson99Ver2 // index 62
import codility.solution.lesson99.ArrayInversionCount.solutionLesson99Ver3 // index 63
import codility.solution.lesson99.PolygonConcavityIndex.solutionLesson99Ver4 // index 64

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        //---------------------------- Caterpillar method----------------------------- //
        // AbsDistinct
        println("AbsDistinct")
        println(solutionLesson15Ver1(intArrayOf(-5, -3, -1, 0, 3, 6)).toString() + "\n------------------")
        // CountDistinctSlices
        println("CountDistinctSlices")
        println(solutionLesson15Ver2(6, intArrayOf(3, 4, 5, 5, 2)).toString() + "\n------------------")
        // CountTriangles
        println("CountTriangles")
        println(solutionLesson15Ver3(intArrayOf(10, 2, 5, 1, 8, 12)).toString() + "\n------------------")
        // MinAbsSumOfTwo
        println("MinAbsSumOfTwo")
        println(solutionLesson15Ver4(intArrayOf(1, 4, -3)))
        println(solutionLesson15Ver4(intArrayOf(-8, 4, 5, -10, 3)).toString() + "\n------------------")
        //---------------------------- Greedy algorithms------------------------------ //
        // MaxNonoverlappingSegments
        println("MaxNonoverlappingSegments")
        println(solutionLesson16Ver1(intArrayOf(1, 3, 7, 9, 9), intArrayOf(5, 6, 8, 9, 10)).toString() + "\n------------------")
        // TieRopes
        println("TieRopes")
        println(solutionLesson16Ver2(4, intArrayOf(1, 2, 3, 4, 1, 1, 3)).toString() + "\n------------------")
        //---------------------------- Dynamic programming---------------------------- //
        // NumberSolitaire
        println("NumberSolitaire")
        println(solutionLesson17Ver1(intArrayOf(1, -2, 0, 9, -1, -2)).toString() + "\n------------------")
        // MinAbsSum
        println("MinAbsSum")
        println(solutionLesson17Ver2(intArrayOf(1, 5, 2, -2)).toString() + "\n------------------")
        //---------------------------- Tasks from Indeed Prime 2015 challenge ---------------------------- //
        // LongestPassword
        println("LongestPassword")
        println(solutionLesson90Ver1("test 5 a0A pass007 ?xy1").toString() + "\n------------------")
        // FloodDepth
        println("FloodDepth")
        println(solutionLesson90Ver2(intArrayOf(1, 3, 2, 1, 2, 1, 5, 3, 3, 4)).toString() + "\n------------------")
        // SlalomSkiing
        println("SlalomSkiing")
        println(solutionLesson90Ver3(intArrayOf(5, 10, 4, 15, 1)))
        println(solutionLesson90Ver3(intArrayOf(15, 13, 5, 7, 4, 10, 12, 8, 2, 11, 6, 9, 3)).toString() + "\n------------------")
        //---------------------------- Tasks from Indeed Prime 2016 challenge ---------------------------- //
        // RectangleBuilderGreaterArea
        println("RectangleBuilderGreaterArea")
        println(solutionLesson91Ver1(intArrayOf(1, 2, 5, 1, 2, 3, 5, 1), 5).toString() + "\n------------------")
        // DwarfsRafting
        println("DwarfsRafting")
        println(solutionLesson91Ver2(4, "1B 1C 4B 1D 2A", "3B 2D").toString() + "\n------------------")
        // HilbertMaze
        println("HilbertMaze")
        println(solutionLesson91Ver3())
        println(solutionLesson91Ver3().toString() + "\n------------------")
        // TreeProduct
        println("TreeProduct")
        println(solutionLesson91Ver4(
                intArrayOf(0, 1),
                intArrayOf(1, 2)
        ) + "\n------------------")
        println(solutionLesson91Ver4(
                intArrayOf(0, 1, 1),
                intArrayOf(1, 2, 3)
        ) + "\n------------------")
        println(solutionLesson91Ver4(
                intArrayOf(0, 1, 2, 3),
                intArrayOf(1, 2, 3, 4)
        ) + "\n------------------")
        println(solutionLesson91Ver4(
                intArrayOf(0, 1, 1, 3, 3, 6, 7),
                intArrayOf(1, 2, 3, 4, 5, 3, 5)
        ) + "\n------------------")
        //---------------------------- Tasks from Indeed Prime 2016 College Coders challenge ---------------------------- //
        // TennisTournament
        println("TennisTournament")
        println(solutionLesson92Ver1(10, 3).toString() + "\n------------------")
        // SocksLaundering
        println("SocksLaundering")
        println(solutionLesson92Ver2(2, intArrayOf(1, 2, 1, 1), intArrayOf(1, 4, 3, 2, 4)).toString() + "\n------------------")
        // ArrayRecovery
        println("ArrayRecovery")
        println(solutionLesson92Ver3())
        println(solutionLesson92Ver3().toString() + "\n------------------")
        // DiamondsCount
        println("DiamondsCount")
//        println(solutionLesson92Ver4())
//        println(solutionLesson92Ver4().toString() + "\n------------------")
        //---------------------------- Future training ---------------------------- //
        // StrSymmetryPoint
        println("StrSymmetryPoint")
        println(solutionLesson99Ver1("x").toString() + "\n------------------")
        // TreeHeight
        println("TreeHeight")
        val test = tree(
            5,
            tree(
                3, tree(20, null, null),
                tree(21, null, null)
            ),
            tree(
                10,
                tree(1, null, null),
                null
            )
        )
        println(solutionLesson99Ver2(test).toString() + "\n------------------")
        // ArrayInversionCount
        println("ArrayInversionCount")
        println(solutionLesson99Ver3(intArrayOf(-1, 6, 3, 4, 7, 4)).toString() + "\n------------------")
        // PolygonConcavityIndex
        println("PolygonConcavityIndex")
        println(solutionLesson99Ver4(
                arrayOf(
                    Point2D(-1, 3),
                    Point2D(3, 1),
                    Point2D(0, -1),
                    Point2D(-2, 1)
                )).toString() + "\n------------------")
    }

    private fun tree(x: Int, l: Tree?, r: Tree?): Tree {
        val tree = Tree()
        tree.x = x
        tree.l = l
        tree.r = r
        return tree
    }

}
