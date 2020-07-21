package codility.solution

import codility.solution.model.Point2D
import codility.solution.model.Tree
import java.util.Arrays

//---------------------------- Lesson0 DemoTask--------------------------------------- //
import codility.solution.lesson0.DemoTask.solutionDemo // index 1
//---------------------------- Lesson1 iterations------------------------------------- //
import codility.solution.lesson1.BinaryGap.solution_lesson1_1 // index 2
//---------------------------- Lesson2 Arrays----------------------------------------- //
import codility.solution.lesson2.CyclicRotation.solution_lesson2_1 // index 3
import codility.solution.lesson2.OddOccurrencesInArray.solution_lesson2_2 // index 4
//---------------------------- Lesson3 Time_Complexity-------------------------------- //
import codility.solution.lesson3.PermMissingElem.solution_lesson3_1 // index 5
import codility.solution.lesson3.FrogJmp.solution_lesson3_2 // index 6
import codility.solution.lesson3.TapeEquilibrium.solution_lesson3_3 // index 7
//---------------------------- Lesson4 Counting_Elements------------------------------ //
import codility.solution.lesson4.PermCheck.solution_lesson4_1 // index 8
import codility.solution.lesson4.FrogRiverOne.solution_lesson4_2 // index 9
import codility.solution.lesson4.MaxCounters.solution_lesson4_3 // index 10
import codility.solution.lesson4.MissingInteger.solution_lesson4_4 // index 11
//---------------------------- Lesson5 Prefix Sums--------------------------- //
import codility.solution.lesson5.PassingCars.solution_lesson5_1 // index 12
import codility.solution.lesson5.GenomicRangeQuery.solution_lesson5_2 // index 13
import codility.solution.lesson5.MinAvgTwoSlice.solution_lesson5_3 // index 14
import codility.solution.lesson5.CountDiv.solution_lesson5_4 // index 15
//---------------------------- Lesson6 Sorting---------------------------------------- //
import codility.solution.lesson6.Distinct.solution_lesson6_1 // index 16
import codility.solution.lesson6.Triangle.solution_lesson6_2 // index 17
import codility.solution.lesson6.MaxProductOfThree.solution_lesson6_3 // index 18
import codility.solution.lesson6.NumberOfDiscIntersections.solution_lesson6_4_1 // index 19
import codility.solution.lesson6.NumberOfDiscIntersections_SimpleLowPerformance.solution_lesson6_4_2 // index 20
//---------------------------- Lesson7 Stack and Queues------------------------------- //
import codility.solution.lesson7.Brackets.solution_lesson7_1 // index 21
import codility.solution.lesson7.Nesting.solution_lesson7_2 // index 22
import codility.solution.lesson7.StoneWall.solution_lesson7_3 // index 23
import codility.solution.lesson7.Fish.solution_lesson7_4 // index 24
//---------------------------- Lesson8 Leader----------------------------------------- //
import codility.solution.lesson8.EquiLeader.solution_lesson8_1 // index 25
import codility.solution.lesson8.Dominator.solution_lesson8_2 // index 26
//---------------------------- Lesson9 Maximum slice problem-------------------------- //
import codility.solution.lesson9.MaxSliceSum.solution_lesson9_1 // index 27
import codility.solution.lesson9.MaxProfit.solution_lesson9_2 // index 28
import codility.solution.lesson9.MaxDoubleSliceSum.solution_lesson9_3 // index 29
//---------------------------- Lesson10 Prime and composite numbers-------------------- //
import codility.solution.lesson10.CountFactors.solution_lesson10_1 // index 30
import codility.solution.lesson10.MinPerimeterRectangle.solution_lesson10_2 // index 31
import codility.solution.lesson10.Peaks.solution_lesson10_3 // index 32
import codility.solution.lesson10.Flags.solution_lesson10_4 // index 33
//---------------------------- Lesson11 Sieve of Eratosthenes-------------------------- //
import codility.solution.lesson11.CountNonDivisible.solution_lesson11_1 // index 34
import codility.solution.lesson11.CountSemiprimes.solution_lesson11_2 // index 35
//---------------------------- Lesson12 Euclidean algorithm---------------------------- //
import codility.solution.lesson12.ChocolatesByNumbers.solution_lesson12_1 // index 36
import codility.solution.lesson12.CommonPrimeDivisors.solution_lesson12_2 // index 37
//---------------------------- Lesson13 Fibonacci numbers------------------------------ //
import codility.solution.lesson13.FibFrog.solution_lesson13_1 // index 38
import codility.solution.lesson13.Ladder.solution_lesson13_2 // index 39
//---------------------------- Lesson14 Binary search algorithm------------------------ //
import codility.solution.lesson14.MinMaxDivision.solution_lesson14_1 // index 40
import codility.solution.lesson14.NailingPlanks.solution_lesson14_2 // index 41
//---------------------------- Lesson15 Caterpillar method----------------------------- //
import codility.solution.lesson15.AbsDistinct.solution_lesson15_1 // index 42
import codility.solution.lesson15.CountDistinctSlices.solution_lesson15_2 // index 43
import codility.solution.lesson15.CountTriangles.solution_lesson15_3 // index 44
import codility.solution.lesson15.MinAbsSumOfTwo.solution_lesson15_4 // index 45
//---------------------------- Lesson16 Greedy algorithms------------------------------ //
import codility.solution.lesson16.MaxNonoverlappingSegments.solution_lesson16_1 // index 46
import codility.solution.lesson16.TieRopes.solution_lesson16_2 // index 47
//---------------------------- Lesson17 Dynamic programming---------------------------- //
import codility.solution.lesson17.NumberSolitaire.solution_lesson17_1 // index 48
import codility.solution.lesson17.MinAbsSum.solution_lesson17_2 // index 49
//---------------------------- Lesson90 Tasks from Indeed Prime 2015 challenge---------------------------- //
import codility.solution.lesson90.LongestPassword.solution_lesson90_1 // index 50
import codility.solution.lesson90.FloodDepth.solution_lesson90_2 // index 51
import codility.solution.lesson90.SlalomSkiing.solution_lesson90_3 // index 52
//---------------------------- Lesson91 Tasks from Indeed Prime 2016 challenge---------------------------- //
import codility.solution.lesson91.RectangleBuilderGreaterArea.solution_lesson91_1 // index 53
import codility.solution.lesson91.DwarfsRafting.solution_lesson91_2 // index 54
import codility.solution.lesson91.HilbertMaze.solution_lesson91_3 // index 55
import codility.solution.lesson91.TreeProduct.solution_lesson91_4 // index 56
//---------------------------- Lesson92 Tasks from Indeed Prime 2016 College Coders challenge---------------------------- //
import codility.solution.lesson92.TennisTournament.solution_lesson92_1 // index 57
import codility.solution.lesson92.SocksLaundering.solution_lesson92_2 // index 58
import codility.solution.lesson92.ArrayRecovery.solution_lesson92_3 // index 59
import codility.solution.lesson92.DiamondsCount.solution_lesson92_4 // index 60
//---------------------------- Lesson99 Future training ---------------------------- //
import codility.solution.lesson99.StrSymmetryPoint.solution_lesson99_1 // index 61
import codility.solution.lesson99.TreeHeight.solution_lesson99_2 // index 62
import codility.solution.lesson99.ArrayInversionCount.solution_lesson99_3 // index 63
import codility.solution.lesson99.PolygonConcavityIndex.solution_lesson99_4 // index 64

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        //---------------------------- DemoTask--------------------------------------- //
        // Demo Task (clear)
        println("Demo Task")
        println(solutionDemo(intArrayOf(1, 3, 6, 4, 1, 2)).toString() + "\n------------------")
        //---------------------------- iterations------------------------------------- //
        // BinaryGap (clear)
        println("BinaryGap")
        println(solution_lesson1_1(1041))
        println(solution_lesson1_1(15))
        println(solution_lesson1_1(32).toString() + "\n------------------")
        //---------------------------- Arrays----------------------------------------- //
        // CyclicRotation (clear)
        println("CyclicRotation")
        println(solution_lesson2_1(intArrayOf(3, 8, 9, 7, 6), 3).contentToString())
        println(solution_lesson2_1(intArrayOf(1, 2, 3, 4), 4).contentToString() + "\n------------------")
        // OddOccurrencesInArray (clear)
        println("OddOccurrencesInArray")
        println(solution_lesson2_2(intArrayOf(9, 3, 9, 3, 9, 7, 9)).toString() + "\n------------------")
        //---------------------------- Time_Complexity-------------------------------- //
        // PermMissingElem (clear)
        println("PermMissingElem")
        println(solution_lesson3_1(intArrayOf(2, 3, 1, 5)).toString() + "\n------------------")
        // FrogJmp (clear)
        println("FrogJmp")
        println(solution_lesson3_2(10, 85, 30).toString() + "\n------------------")
        // TapeEquilibrium (clear)
        println("TapeEquilibrium")
        println(solution_lesson3_3(intArrayOf(3, 1, 2, 4, 3)).toString() + "\n------------------")
        //---------------------------- Counting_Elements------------------------------ //
        // PermCheck (clear)
        println("PermCheck")
        println(solution_lesson4_1(intArrayOf(4, 1, 3, 2)).toString() + "\n------------------")
        // FrogRiverOne
        println("FrogRiverOne")
        println(solution_lesson4_2(5, intArrayOf(1, 3, 1, 4, 2, 3, 5, 4)).toString() + "\n------------------")
        // MaxCounters
        println("MaxCounters")
        println(solution_lesson4_3(5, intArrayOf(3, 4, 4, 6, 1, 4, 4)).contentToString() + "\n------------------")
        // MissingInteger
        println("MissingInteger")
        println(solution_lesson4_4(intArrayOf(1, 3, 6, 4, 1, 2)))
        println(solution_lesson4_4(intArrayOf(1, 2, 3)))
        println(solution_lesson4_4(intArrayOf(-1, -3)).toString() + "\n------------------")
        //---------------------------- Prefix Sums--------------------------- //
        // PassingCars
        println("PassingCars")
        println(solution_lesson5_1(intArrayOf(0, 1, 0, 1, 1)).toString() + "\n------------------")
        // GenomicRangeQuery
        println("GenomicRangeQuery")
        println(solution_lesson5_2("CAGCCTA", intArrayOf(2, 5, 0), intArrayOf(4, 5, 6)).contentToString() + "\n------------------")
        // MinAvgTwoSlice
        println("MinAvgTwoSlice")
        println(solution_lesson5_3(intArrayOf(4, 2, 2, 5, 1, 5, 8)).toString() + "\n------------------")
        // CountDiv
        println("CountDiv")
        println(solution_lesson5_4(6, 11, 2).toString() + "\n------------------")
        //---------------------------- Sorting---------------------------------------- //
        // Distinct
        println("Distinct")
        println(solution_lesson6_1(intArrayOf(2, 1, 1, 2, 3, 1)).toString() + "\n------------------")
        // Triangle
        println("Triangle")
        println(solution_lesson6_2(intArrayOf(10, 2, 5, 1, 8, 20)).toString() + "\n------------------")
        println(solution_lesson6_2(intArrayOf(10, 50, 5, 1)).toString() + "\n------------------")
        // MaxProductOfThree
        println("MaxProductOfThree")
        println(solution_lesson6_3(intArrayOf(-3, 1, 2, -2, 5, 6)).toString() + "\n------------------")
        // NumberOfDiscIntersections
        println("NumberOfDiscIntersections")
        println(solution_lesson6_4_1(intArrayOf(1, 5, 2, 1, 4, 0)).toString() + "\n------------------")
        println(solution_lesson6_4_2(intArrayOf(1, 5, 2, 1, 4, 0)).toString() + "\n------------------")
        //---------------------------- Stack and Queues------------------------------- //
        // Brackets
        println("Brackets")
        println(solution_lesson7_1("{[()()]}").toString() + "\n------------------")
        // Nesting
        println("Nesting")
        println(solution_lesson7_2("(()(())())").toString() + "\n------------------")
        // StoneWall
        println("StoneWall")
        println(solution_lesson7_3(intArrayOf(8, 8, 5, 7, 9, 8, 7, 4, 8)).toString() + "\n------------------")
        // Fish
        println("Fish")
        println(solution_lesson7_4(intArrayOf(4, 3, 2, 1, 5), intArrayOf(0, 1, 0, 0, 0)).toString() + "\n------------------")
        //---------------------------- Leader----------------------------------------- //
        // EquiLeader
        println("EquiLeader")
        println(solution_lesson8_1(intArrayOf(4, 3, 4, 4, 4, 2)).toString() + "\n------------------")
        // Dominator
        println("Dominator")
        println(solution_lesson8_2(intArrayOf(3, 4, 3, 2, 3, -1, 3, 3)).toString() + "\n------------------")
        //---------------------------- Maximum slice problem-------------------------- //
        // MaxSliceSum
        println("MaxSliceSum")
        println(solution_lesson9_1(intArrayOf(3, 1, -6, 4, 0)).toString() + "\n------------------")
        // MaxProfit
        println("MaxProfit")
        println(solution_lesson9_2(intArrayOf(23171, 21011, 21123, 21366, 21013, 21367)).toString() + "\n------------------")
        // MaxDoubleSliceSum
        println("MaxDoubleSliceSum")
        println(solution_lesson9_3(intArrayOf(3, 2, 6, -1, 4, 5, -1, 2)).toString() + "\n------------------")
        //---------------------------- Prime and composite numbers-------------------- //
        // CountFactors
        println("CountFactors")
        println(solution_lesson10_1(24).toString() + "\n------------------")
        // MinPerimeterRectangle
        println("MinPerimeterRectangle")
        println(solution_lesson10_2(30).toString() + "\n------------------")
        // Peaks
        println("Peaks")
        println(solution_lesson10_3(intArrayOf(1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2)).toString() + "\n------------------")
        // Flags
        println("Flags")
        println(solution_lesson10_4(intArrayOf(1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2)).toString() + "\n------------------")
        //---------------------------- Sieve of Eratosthenes-------------------------- //
        // CountNonDivisible
        println("CountNonDivisible")
        println(solution_lesson11_1(intArrayOf(3, 1, 2, 3, 6)).contentToString() + "\n------------------")
        // CountSemiprimes
        println("CountSemiprimes")
        println(solution_lesson11_2(26, intArrayOf(1, 4, 16), intArrayOf(26, 10, 20)).contentToString() + "\n------------------")
        //---------------------------- Euclidean algorithm---------------------------- //
        // ChocolatesByNumbers
        println("ChocolatesByNumbers")
        println(solution_lesson12_1(10, 4).toString() + "\n------------------")
        // CommonPrimeDivisors
        println("CommonPrimeDivisors")
        println(solution_lesson12_2(intArrayOf(15, 10, 3), intArrayOf(75, 30, 5)).toString() + "\n------------------")
        //---------------------------- Fibonacci numbers------------------------------ //
        // FibFrog
        println("FibFrog")
        println(solution_lesson13_1(intArrayOf(0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0)).toString() + "\n------------------")
        // Ladder
        println("Ladder")
        println(solution_lesson13_2(intArrayOf(4, 4, 5, 5, 1), intArrayOf(3, 2, 4, 3, 1)).contentToString() + "\n------------------")
        //---------------------------- Binary search algorithm------------------------ //
        // MinMaxDivision
        println("MinMaxDivision")
        println(solution_lesson14_1(3, intArrayOf(2, 1, 5, 1, 2, 2, 2)).toString() + "\n------------------")
        // NailingPlanks
        println("NailingPlanks")
        println(solution_lesson14_2(intArrayOf(1, 4, 5, 8), intArrayOf(4, 5, 9, 10), intArrayOf(4, 6, 7, 10, 2)).toString() + "\n------------------")
        //---------------------------- Caterpillar method----------------------------- //
        // AbsDistinct
        println("AbsDistinct")
        println(solution_lesson15_1(intArrayOf(-5, -3, -1, 0, 3, 6)).toString() + "\n------------------")
        // CountDistinctSlices
        println("CountDistinctSlices")
        println(solution_lesson15_2(6, intArrayOf(3, 4, 5, 5, 2)).toString() + "\n------------------")
        // CountTriangles
        println("CountTriangles")
        println(solution_lesson15_3(intArrayOf(10, 2, 5, 1, 8, 12)).toString() + "\n------------------")
        // MinAbsSumOfTwo
        println("MinAbsSumOfTwo")
        println(solution_lesson15_4(intArrayOf(1, 4, -3)))
        println(solution_lesson15_4(intArrayOf(-8, 4, 5, -10, 3)).toString() + "\n------------------")
        //---------------------------- Greedy algorithms------------------------------ //
        // MaxNonoverlappingSegments
        println("MaxNonoverlappingSegments")
        println(solution_lesson16_1(intArrayOf(1, 3, 7, 9, 9), intArrayOf(5, 6, 8, 9, 10)).toString() + "\n------------------")
        // TieRopes
        println("TieRopes")
        println(solution_lesson16_2(4, intArrayOf(1, 2, 3, 4, 1, 1, 3)).toString() + "\n------------------")
        //---------------------------- Dynamic programming---------------------------- //
        // NumberSolitaire
        println("NumberSolitaire")
        println(solution_lesson17_1(intArrayOf(1, -2, 0, 9, -1, -2)).toString() + "\n------------------")
        // MinAbsSum
        println("MinAbsSum")
        println(solution_lesson17_2(intArrayOf(1, 5, 2, -2)).toString() + "\n------------------")
        //---------------------------- Tasks from Indeed Prime 2015 challenge ---------------------------- //
        // LongestPassword
        println("LongestPassword")
        println(solution_lesson90_1("test 5 a0A pass007 ?xy1").toString() + "\n------------------")
        // FloodDepth
        println("FloodDepth")
        println(solution_lesson90_2(intArrayOf(1, 3, 2, 1, 2, 1, 5, 3, 3, 4)).toString() + "\n------------------")
        // SlalomSkiing
        println("SlalomSkiing")
        println(solution_lesson90_3(intArrayOf(5, 10, 4, 15, 1)))
        println(solution_lesson90_3(intArrayOf(15, 13, 5, 7, 4, 10, 12, 8, 2, 11, 6, 9, 3)).toString() + "\n------------------")
        //---------------------------- Tasks from Indeed Prime 2016 challenge ---------------------------- //
        // RectangleBuilderGreaterArea
        println("RectangleBuilderGreaterArea")
        println(solution_lesson91_1(intArrayOf(1, 2, 5, 1, 2, 3, 5, 1), 5).toString() + "\n------------------")
        // DwarfsRafting
        println("DwarfsRafting")
        println(solution_lesson91_2(4, "1B 1C 4B 1D 2A", "3B 2D").toString() + "\n------------------")
        // HilbertMaze
        println("HilbertMaze")
        println(solution_lesson91_3())
        println(solution_lesson91_3().toString() + "\n------------------")
        // TreeProduct
        println("TreeProduct")
        println(solution_lesson91_4(
                intArrayOf(0, 1),
                intArrayOf(1, 2)
        ) + "\n------------------")
        println(solution_lesson91_4(
                intArrayOf(0, 1, 1),
                intArrayOf(1, 2, 3)
        ) + "\n------------------")
        println(solution_lesson91_4(
                intArrayOf(0, 1, 2, 3),
                intArrayOf(1, 2, 3, 4)
        ) + "\n------------------")
        println(solution_lesson91_4(
                intArrayOf(0, 1, 1, 3, 3, 6, 7),
                intArrayOf(1, 2, 3, 4, 5, 3, 5)
        ) + "\n------------------")
        //---------------------------- Tasks from Indeed Prime 2016 College Coders challenge ---------------------------- //
        // TennisTournament
        println("TennisTournament")
        println(solution_lesson92_1(10, 3).toString() + "\n------------------")
        // SocksLaundering
        println("SocksLaundering")
        println(solution_lesson92_2(2, intArrayOf(1, 2, 1, 1), intArrayOf(1, 4, 3, 2, 4)).toString() + "\n------------------")
        // ArrayRecovery
        println("ArrayRecovery")
        println(solution_lesson92_3())
        println(solution_lesson92_3().toString() + "\n------------------")
        // DiamondsCount
        println("DiamondsCount")
        println(solution_lesson92_4())
        println(solution_lesson92_4().toString() + "\n------------------")
        //---------------------------- Future training ---------------------------- //
        // StrSymmetryPoint
        println("StrSymmetryPoint")
        println(solution_lesson99_1("x").toString() + "\n------------------")
        // TreeHeight
        println("TreeHeight")
        val test = tree(
            5, tree(
                3, tree(20, null, null),
                tree(21, null, null)
            ), tree(10, tree(1, null, null), null)
        )
        println(solution_lesson99_2(test).toString() + "\n------------------")
        // ArrayInversionCount
        println("ArrayInversionCount")
        println(solution_lesson99_3(intArrayOf(-1, 6, 3, 4, 7, 4)).toString() + "\n------------------")
        // PolygonConcavityIndex
        println("PolygonConcavityIndex")
        println(solution_lesson99_4(
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
