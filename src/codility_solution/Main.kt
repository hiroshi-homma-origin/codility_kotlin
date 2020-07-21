package codility_solution

import codility_solution.model.Point2D
import codility_solution.model.Tree
import java.util.Arrays

//---------------------------- Lesson0 DemoTask--------------------------------------- //
import codility_solution.Lesson0.DemoTask.DemoTask.solution_demo // index 1
//---------------------------- Lesson1 iterations------------------------------------- //
import codility_solution.Lesson1.Iterations.BinaryGap.solution_lesson1_1 // index 2
//---------------------------- Lesson2 Arrays----------------------------------------- //
import codility_solution.Lesson2.Arrays.CyclicRotation.solution_lesson2_1 // index 3
import codility_solution.Lesson2.Arrays.OddOccurrencesInArray.solution_lesson2_2 // index 4
//---------------------------- Lesson3 Time_Complexity-------------------------------- //
import codility_solution.Lesson3.Time_Complexity.PermMissingElem.solution_lesson3_1 // index 5
import codility_solution.Lesson3.Time_Complexity.FrogJmp.solution_lesson3_2 // index 6
import codility_solution.Lesson3.Time_Complexity.TapeEquilibrium.solution_lesson3_3 // index 7
//---------------------------- Lesson4 Counting_Elements------------------------------ //
import codility_solution.Lesson4.Counting_Elements.PermCheck.solution_lesson4_1 // index 8
import codility_solution.Lesson4.Counting_Elements.FrogRiverOne.solution_lesson4_2 // index 9
import codility_solution.Lesson4.Counting_Elements.MaxCounters.solution_lesson4_3 // index 10
import codility_solution.Lesson4.Counting_Elements.MissingInteger.solution_lesson4_4 // index 11
//---------------------------- Lesson5 Prefix Sums--------------------------- //
import codility_solution.Lesson5.Prefix_Sums.PassingCars.solution_lesson5_1 // index 12
import codility_solution.Lesson5.Prefix_Sums.GenomicRangeQuery.solution_lesson5_2 // index 13
import codility_solution.Lesson5.Prefix_Sums.MinAvgTwoSlice.solution_lesson5_3 // index 14
import codility_solution.Lesson5.Prefix_Sums.CountDiv.solution_lesson5_4 // index 15
//---------------------------- Lesson6 Sorting---------------------------------------- //
import codility_solution.Lesson6.Sorting.Distinct.solution_lesson6_1 // index 16
import codility_solution.Lesson6.Sorting.Triangle.solution_lesson6_2 // index 17
import codility_solution.Lesson6.Sorting.MaxProductOfThree.solution_lesson6_3 // index 18
import codility_solution.Lesson6.Sorting.NumberOfDiscIntersections.solution_lesson6_4_1 // index 19
import codility_solution.Lesson6.Sorting.NumberOfDiscIntersections_SimpleLowPerformance.solution_lesson6_4_2 // index 20
//---------------------------- Lesson7 Stack and Queues------------------------------- //
import codility_solution.Lesson7.Stacks_and_Queues.Brackets.solution_lesson7_1 // index 21
import codility_solution.Lesson7.Stacks_and_Queues.Nesting.solution_lesson7_2 // index 22
import codility_solution.Lesson7.Stacks_and_Queues.StoneWall.solution_lesson7_3 // index 23
import codility_solution.Lesson7.Stacks_and_Queues.Fish.solution_lesson7_4 // index 24
//---------------------------- Lesson8 Leader----------------------------------------- //
import codility_solution.Lesson8.Leader.EquiLeader.solution_lesson8_1 // index 25
import codility_solution.Lesson8.Leader.Dominator.solution_lesson8_2 // index 26
//---------------------------- Lesson9 Maximum slice problem-------------------------- //
import codility_solution.Lesson9.Maximum_slice_problem.MaxSliceSum.solution_lesson9_1 // index 27
import codility_solution.Lesson9.Maximum_slice_problem.MaxProfit.solution_lesson9_2 // index 28
import codility_solution.Lesson9.Maximum_slice_problem.MaxDoubleSliceSum.solution_lesson9_3 // index 29
//---------------------------- Lesson10 Prime and composite numbers-------------------- //
import codility_solution.Lesson10.Prime_and_composite_numbers.CountFactors.solution_lesson10_1 // index 30
import codility_solution.Lesson10.Prime_and_composite_numbers.MinPerimeterRectangle.solution_lesson10_2 // index 31
import codility_solution.Lesson10.Prime_and_composite_numbers.Peaks.solution_lesson10_3 // index 32
import codility_solution.Lesson10.Prime_and_composite_numbers.Flags.solution_lesson10_4 // index 33
//---------------------------- Lesson11 Sieve of Eratosthenes-------------------------- //
import codility_solution.Lesson11.Sieve_of_Eratosthenes.CountNonDivisible.solution_lesson11_1 // index 34
import codility_solution.Lesson11.Sieve_of_Eratosthenes.CountSemiprimes.solution_lesson11_2 // index 35
//---------------------------- Lesson12 Euclidean algorithm---------------------------- //
import codility_solution.Lesson12.Euclidean_algorithm.ChocolatesByNumbers.solution_lesson12_1 // index 36
import codility_solution.Lesson12.Euclidean_algorithm.CommonPrimeDivisors.solution_lesson12_2 // index 37
//---------------------------- Lesson13 Fibonacci numbers------------------------------ //
import codility_solution.Lesson13.Fibonacci_numbers.FibFrog.solution_lesson13_1 // index 38
import codility_solution.Lesson13.Fibonacci_numbers.Ladder.solution_lesson13_2 // index 39
//---------------------------- Lesson14 Binary search algorithm------------------------ //
import codility_solution.Lesson14.Binary_search_algorithm.MinMaxDivision.solution_lesson14_1 // index 40
import codility_solution.Lesson14.Binary_search_algorithm.NailingPlanks.solution_lesson14_2 // index 41
//---------------------------- Lesson15 Caterpillar method----------------------------- //
import codility_solution.Lesson15.Caterpillar_method.AbsDistinct.solution_lesson15_1 // index 42
import codility_solution.Lesson15.Caterpillar_method.CountDistinctSlices.solution_lesson15_2 // index 43
import codility_solution.Lesson15.Caterpillar_method.CountTriangles.solution_lesson15_3 // index 44
import codility_solution.Lesson15.Caterpillar_method.MinAbsSumOfTwo.solution_lesson15_4 // index 45
//---------------------------- Lesson16 Greedy algorithms------------------------------ //
import codility_solution.Lesson16.Greedy_algorithms.MaxNonoverlappingSegments.solution_lesson16_1 // index 46
import codility_solution.Lesson16.Greedy_algorithms.TieRopes.solution_lesson16_2 // index 47
//---------------------------- Lesson17 Dynamic programming---------------------------- //
import codility_solution.Lesson17.Dynamic_programming.NumberSolitaire.solution_lesson17_1 // index 48
import codility_solution.Lesson17.Dynamic_programming.MinAbsSum.solution_lesson17_2 // index 49
//---------------------------- Lesson90 Tasks from Indeed Prime 2015 challenge---------------------------- //
import codility_solution.Lesson90.Tasks_from_Indeed_Prime_2015_challenge.LongestPassword.solution_lesson90_1 // index 50
import codility_solution.Lesson90.Tasks_from_Indeed_Prime_2015_challenge.FloodDepth.solution_lesson90_2 // index 51
import codility_solution.Lesson90.Tasks_from_Indeed_Prime_2015_challenge.SlalomSkiing.solution_lesson90_3 // index 52
//---------------------------- Lesson91 Tasks from Indeed Prime 2016 challenge---------------------------- //
import codility_solution.Lesson91.Tasks_from_Indeed_Prime_2016_challenge.RectangleBuilderGreaterArea.solution_lesson91_1 // index 53
import codility_solution.Lesson91.Tasks_from_Indeed_Prime_2016_challenge.DwarfsRafting.solution_lesson91_2 // index 54
import codility_solution.Lesson91.Tasks_from_Indeed_Prime_2016_challenge.HilbertMaze.solution_lesson91_3 // index 55
import codility_solution.Lesson91.Tasks_from_Indeed_Prime_2016_challenge.TreeProduct.solution_lesson91_4 // index 56
//---------------------------- Lesson92 Tasks from Indeed Prime 2016 College Coders challenge---------------------------- //
import codility_solution.Lesson92.Tasks_from_Indeed_Prime_2016_College_Coders_challenge.TennisTournament.solution_lesson92_1 // index 57
import codility_solution.Lesson92.Tasks_from_Indeed_Prime_2016_College_Coders_challenge.SocksLaundering.solution_lesson92_2 // index 58
import codility_solution.Lesson92.Tasks_from_Indeed_Prime_2016_College_Coders_challenge.ArrayRecovery.solution_lesson92_3 // index 59
import codility_solution.Lesson92.Tasks_from_Indeed_Prime_2016_College_Coders_challenge.DiamondsCount.solution_lesson92_4 // index 60
//---------------------------- Lesson99 Future training ---------------------------- //
import codility_solution.Lesson99.Future_training.StrSymmetryPoint.solution_lesson99_1 // index 61
import codility_solution.Lesson99.Future_training.TreeHeight.solution_lesson99_2 // index 62
import codility_solution.Lesson99.Future_training.ArrayInversionCount.solution_lesson99_3 // index 63
import codility_solution.Lesson99.Future_training.PolygonConcavityIndex.solution_lesson99_4 // index 64

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        //---------------------------- DemoTask--------------------------------------- //
        // Demo Task (clear)
        println("Demo Task")
        println(solution_demo(intArrayOf(1, 3, 6, 4, 1, 2)).toString() + "\n------------------")
        //---------------------------- iterations------------------------------------- //
        // BinaryGap (clear)
        println("BinaryGap")
        System.out.println(solution_lesson1_1(1041))
        System.out.println(solution_lesson1_1(15))
        println(solution_lesson1_1(32).toString() + "\n------------------")
        //---------------------------- Arrays----------------------------------------- //
        // CyclicRotation (clear)
        println("CyclicRotation")
        println(Arrays.toString(solution_lesson2_1(intArrayOf(3, 8, 9, 7, 6), 3)))
        println(Arrays.toString(solution_lesson2_1(intArrayOf(1, 2, 3, 4), 4)) + "\n------------------")
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
        println(Arrays.toString(solution_lesson4_3(5, intArrayOf(3, 4, 4, 6, 1, 4, 4))) + "\n------------------")
        // MissingInteger
        println("MissingInteger")
        System.out.println(solution_lesson4_4(intArrayOf(1, 3, 6, 4, 1, 2)))
        System.out.println(solution_lesson4_4(intArrayOf(1, 2, 3)))
        println(solution_lesson4_4(intArrayOf(-1, -3)).toString() + "\n------------------")
        //---------------------------- Prefix Sums--------------------------- //
        // PassingCars
        println("PassingCars")
        println(solution_lesson5_1(intArrayOf(0, 1, 0, 1, 1)).toString() + "\n------------------")
        // GenomicRangeQuery
        println("GenomicRangeQuery")
        println(Arrays.toString(solution_lesson5_2("CAGCCTA", intArrayOf(2, 5, 0), intArrayOf(4, 5, 6))) + "\n------------------")
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
        println(Arrays.toString(solution_lesson11_1(intArrayOf(3, 1, 2, 3, 6))) + "\n------------------")
        // CountSemiprimes
        println("CountSemiprimes")
        println(Arrays.toString(solution_lesson11_2(26, intArrayOf(1, 4, 16), intArrayOf(26, 10, 20))) + "\n------------------")
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
        println(Arrays.toString(solution_lesson13_2(intArrayOf(4, 4, 5, 5, 1), intArrayOf(3, 2, 4, 3, 1))) + "\n------------------")
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
        System.out.println(solution_lesson15_4(intArrayOf(1, 4, -3)))
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
        System.out.println(solution_lesson90_3(intArrayOf(5, 10, 4, 15, 1)))
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
        System.out.println(solution_lesson91_3(1, 2, 1, 3, 4))
        println(solution_lesson91_3(2, 2, 5, 6, 6).toString() + "\n------------------")
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
        System.out.println(solution_lesson92_3(intArrayOf(0, 2, 2), 10))
        println(solution_lesson92_3(intArrayOf(0, 3, 5, 6), 10).toString() + "\n------------------")
        // DiamondsCount
        println("DiamondsCount")
        System.out.println(solution_lesson92_4(
                intArrayOf(1, 1, 2, 2, 2, 3, 3),
                intArrayOf(3, 4, 1, 3, 5, 3, 4)
        ))
        println(solution_lesson92_4(
                intArrayOf(1, 2, 3, 3, 2, 1),
                intArrayOf(1, 1, 1, 2, 2, 2)
        ).toString() + "\n------------------")
        //---------------------------- Future training ---------------------------- //
        // StrSymmetryPoint
        println("StrSymmetryPoint")
        println(solution_lesson99_1("x").toString() + "\n------------------")
        // TreeHeight
        println("TreeHeight")
        val test = tree(5, tree(3, tree(20, null, null),
                tree(21, null, null)), tree(10, tree(1, null, null), null))
        println(solution_lesson99_2(test).toString() + "\n------------------")
        // ArrayInversionCount
        println("ArrayInversionCount")
        println(solution_lesson99_3(intArrayOf(-1, 6, 3, 4, 7, 4)).toString() + "\n------------------")
        // PolygonConcavityIndex
        println("PolygonConcavityIndex")
        println(solution_lesson99_4(
                arrayOf(Point2D(-1, 3), Point2D(3, 1), Point2D(0, -1), Point2D(-2, 1))).toString() + "\n------------------")
    }

    private fun tree(x: Int, l: Tree?, r: Tree?): Tree {
        val tree = Tree()
        tree.x = x
        tree.l = l
        tree.r = r
        return tree
    }

}
