package codility.solution.execution

import codility.solution.model.Point2D
import codility.solution.model.Tree

//---------------------------- Lesson1 iterations------------------------------------- //
import codility.solution.lesson1.BinaryGap.solutionLesson1Ver1 // index 2
//---------------------------- Lesson2 Arrays----------------------------------------- //
import codility.solution.lesson2.CyclicRotation.solutionLesson2Ver1 // index 3
import codility.solution.lesson2.OddOccurrencesInArray.solutionLesson2Ver2 // index 4
//---------------------------- Lesson3 Time_Complexity-------------------------------- //
import codility.solution.lesson3.PermMissingElem.solutionLesson3Ver1 // index 5
import codility.solution.lesson3.FrogJmp.solutionLesson3Ver2 // index 6
import codility.solution.lesson3.TapeEquilibrium.solutionLesson3Ver3 // index 7
//---------------------------- Lesson4 Counting_Elements------------------------------ //
import codility.solution.lesson4.PermCheck.solutionLesson4Ver1 // index 8
import codility.solution.lesson4.FrogRiverOne.solutionLesson4Ver2 // index 9
import codility.solution.lesson4.MaxCounters.solutionLesson4Ver3 // index 10
import codility.solution.lesson4.MissingInteger.solutionLesson4Ver4 // index 11
//---------------------------- Lesson5 Prefix Sums--------------------------- //
import codility.solution.lesson5.PassingCars.solutionLesson5Ver1 // index 12
import codility.solution.lesson5.GenomicRangeQuery.solutionLesson5Ver2 // index 13
import codility.solution.lesson5.MinAvgTwoSlice.solutionLesson5Ver3 // index 14
import codility.solution.lesson5.CountDiv.solutionLesson5Ver4 // index 15
//---------------------------- Lesson6 Sorting---------------------------------------- //
import codility.solution.lesson6.Distinct.solutionLesson6Ver1 // index 16
import codility.solution.lesson6.Triangle.solutionLesson6Ver2 // index 17
import codility.solution.lesson6.MaxProductOfThree.solutionLesson6Ver3 // index 18
import codility.solution.lesson6.NumberOfDiscIntersections.solutionLesson6Ver4To1 // index 19
import codility.solution.lesson6.NumberOfDiscIntersections_SimpleLowPerformance.solutionLesson6Ver4To2 // index 20
//---------------------------- Lesson7 Stack and Queues------------------------------- //
import codility.solution.lesson7.Brackets.solutionLesson7Ver1 // index 21
import codility.solution.lesson7.Nesting.solutionLesson7Ver2 // index 22
import codility.solution.lesson7.StoneWall.solutionLesson7Ver3 // index 23
import codility.solution.lesson7.Fish.solutionLesson7Ver4 // index 24
//---------------------------- Lesson8 Leader----------------------------------------- //
import codility.solution.lesson8.EquiLeader.solutionLesson8Ver1 // index 25
import codility.solution.lesson8.Dominator.solutionLesson8Ver2 // index 26
//---------------------------- Lesson9 Maximum slice problem-------------------------- //
import codility.solution.lesson9.MaxSliceSum.solutionLesson9Ver1 // index 27
import codility.solution.lesson9.MaxProfit.solutionLesson9Ver2 // index 28
import codility.solution.lesson9.MaxDoubleSliceSum.solutionLesson9Ver3 // index 29
//---------------------------- Lesson10 Prime and composite numbers-------------------- //
import codility.solution.lesson10.CountFactors.solutionLesson10Ver1 // index 30
import codility.solution.lesson10.MinPerimeterRectangle.solutionLesson10Ver2 // index 31
import codility.solution.lesson10.Peaks.solutionLesson10Ver3 // index 32
import codility.solution.lesson10.Flags.solutionLesson10Ver4 // index 33
//---------------------------- Lesson11 Sieve of Eratosthenes-------------------------- //
import codility.solution.lesson11.CountNonDivisible.solutionLesson11Ver1 // index 34
import codility.solution.lesson11.CountSemiprimes.solutionLesson11Ver2 // index 35
//---------------------------- Lesson12 Euclidean algorithm---------------------------- //
import codility.solution.lesson12.ChocolatesByNumbers.solutionLesson12Ver1 // index 36
import codility.solution.lesson12.CommonPrimeDivisors.solutionLesson12Ver2 // index 37
//---------------------------- Lesson13 Fibonacci numbers------------------------------ //
import codility.solution.lesson13.FibFrog.solutionLesson13Ver1 // index 38
import codility.solution.lesson13.Ladder.solutionLesson13Ver2 // index 39
//---------------------------- Lesson14 Binary search algorithm------------------------ //
import codility.solution.lesson14.MinMaxDivision.solutionLesson14Ver1 // index 40
import codility.solution.lesson14.NailingPlanks.solutionLesson14Ver2 // index 41
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
import codility.solution.lesson92.DiamondsCount.solutionLesson92Ver4 // index 60
//---------------------------- Lesson99 Future training ---------------------------- //
import codility.solution.lesson99.StrSymmetryPoint.solutionLesson99Ver1 // index 61
import codility.solution.lesson99.TreeHeight.solutionLesson99Ver2 // index 62
import codility.solution.lesson99.ArrayInversionCount.solutionLesson99Ver3 // index 63
import codility.solution.lesson99.PolygonConcavityIndex.solutionLesson99Ver4 // index 64

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        //---------------------------- Arrays----------------------------------------- //
        // CyclicRotation (clear)
        println("CyclicRotation")
        println(solutionLesson2Ver1(intArrayOf(3, 8, 9, 7, 6), 3).contentToString())
        println(solutionLesson2Ver1(intArrayOf(1, 2, 3, 4), 4).contentToString() + "\n------------------")
        // OddOccurrencesInArray (clear)
        println("OddOccurrencesInArray")
        println(solutionLesson2Ver2(intArrayOf(9, 3, 9, 3, 9, 7, 9)).toString() + "\n------------------")
        //---------------------------- Time_Complexity-------------------------------- //
        // PermMissingElem (clear)
        println("PermMissingElem")
        println(solutionLesson3Ver1(intArrayOf(2, 3, 1, 5)).toString() + "\n------------------")
        // FrogJmp (clear)
        println("FrogJmp")
        println(solutionLesson3Ver2(10, 85, 30).toString() + "\n------------------")
        // TapeEquilibrium (clear)
        println("TapeEquilibrium")
        println(solutionLesson3Ver3(intArrayOf(3, 1, 2, 4, 3)).toString() + "\n------------------")
        //---------------------------- Counting_Elements------------------------------ //
        // PermCheck (clear)
        println("PermCheck")
        println(solutionLesson4Ver1(intArrayOf(4, 1, 3, 2)).toString() + "\n------------------")
        // FrogRiverOne
        println("FrogRiverOne")
        println(solutionLesson4Ver2(5, intArrayOf(1, 3, 1, 4, 2, 3, 5, 4)).toString() + "\n------------------")
        // MaxCounters
        println("MaxCounters")
        println(solutionLesson4Ver3(5, intArrayOf(3, 4, 4, 6, 1, 4, 4)).contentToString() + "\n------------------")
        // MissingInteger
        println("MissingInteger")
        println(solutionLesson4Ver4(intArrayOf(1, 3, 6, 4, 1, 2)))
        println(solutionLesson4Ver4(intArrayOf(1, 2, 3)))
        println(solutionLesson4Ver4(intArrayOf(-1, -3)).toString() + "\n------------------")
        //---------------------------- Prefix Sums--------------------------- //
        // PassingCars
        println("PassingCars")
        println(solutionLesson5Ver1(intArrayOf(0, 1, 0, 1, 1)).toString() + "\n------------------")
        // GenomicRangeQuery
        println("GenomicRangeQuery")
        println(solutionLesson5Ver2("CAGCCTA", intArrayOf(2, 5, 0), intArrayOf(4, 5, 6)).contentToString() + "\n------------------")
        // MinAvgTwoSlice
        println("MinAvgTwoSlice")
        println(solutionLesson5Ver3(intArrayOf(4, 2, 2, 5, 1, 5, 8)).toString() + "\n------------------")
        // CountDiv
        println("CountDiv")
        println(solutionLesson5Ver4(6, 11, 2).toString() + "\n------------------")
        //---------------------------- Sorting---------------------------------------- //
        // Distinct
        println("Distinct")
        println(solutionLesson6Ver1(intArrayOf(2, 1, 1, 2, 3, 1)).toString() + "\n------------------")
        // Triangle
        println("Triangle")
        println(solutionLesson6Ver2(intArrayOf(10, 2, 5, 1, 8, 20)).toString() + "\n------------------")
        println(solutionLesson6Ver2(intArrayOf(10, 50, 5, 1)).toString() + "\n------------------")
        // MaxProductOfThree
        println("MaxProductOfThree")
        println(solutionLesson6Ver3(intArrayOf(-3, 1, 2, -2, 5, 6)).toString() + "\n------------------")
        // NumberOfDiscIntersections
        println("NumberOfDiscIntersections")
        println(solutionLesson6Ver4To1(intArrayOf(1, 5, 2, 1, 4, 0)).toString() + "\n------------------")
        println(solutionLesson6Ver4To2(intArrayOf(1, 5, 2, 1, 4, 0)).toString() + "\n------------------")
        //---------------------------- Stack and Queues------------------------------- //
        // Brackets
        println("Brackets")
        println(solutionLesson7Ver1("{[()()]}").toString() + "\n------------------")
        // Nesting
        println("Nesting")
        println(solutionLesson7Ver2("(()(())())").toString() + "\n------------------")
        // StoneWall
        println("StoneWall")
        println(solutionLesson7Ver3(intArrayOf(8, 8, 5, 7, 9, 8, 7, 4, 8)).toString() + "\n------------------")
        // Fish
        println("Fish")
        println(solutionLesson7Ver4(intArrayOf(4, 3, 2, 1, 5), intArrayOf(0, 1, 0, 0, 0)).toString() + "\n------------------")
        //---------------------------- Leader----------------------------------------- //
        // EquiLeader
        println("EquiLeader")
        println(solutionLesson8Ver1(intArrayOf(4, 3, 4, 4, 4, 2)).toString() + "\n------------------")
        // Dominator
        println("Dominator")
        println(solutionLesson8Ver2(intArrayOf(3, 4, 3, 2, 3, -1, 3, 3)).toString() + "\n------------------")
        //---------------------------- Maximum slice problem-------------------------- //
        // MaxSliceSum
        println("MaxSliceSum")
        println(solutionLesson9Ver1(intArrayOf(3, 1, -6, 4, 0)).toString() + "\n------------------")
        // MaxProfit
        println("MaxProfit")
        println(solutionLesson9Ver2(intArrayOf(23171, 21011, 21123, 21366, 21013, 21367)).toString() + "\n------------------")
        // MaxDoubleSliceSum
        println("MaxDoubleSliceSum")
        println(solutionLesson9Ver3(intArrayOf(3, 2, 6, -1, 4, 5, -1, 2)).toString() + "\n------------------")
        //---------------------------- Prime and composite numbers-------------------- //
        // CountFactors
        println("CountFactors")
        println(solutionLesson10Ver1(24).toString() + "\n------------------")
        // MinPerimeterRectangle
        println("MinPerimeterRectangle")
        println(solutionLesson10Ver2(30).toString() + "\n------------------")
        // Peaks
        println("Peaks")
        println(solutionLesson10Ver3(intArrayOf(1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2)).toString() + "\n------------------")
        // Flags
        println("Flags")
        println(solutionLesson10Ver4(intArrayOf(1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2)).toString() + "\n------------------")
        //---------------------------- Sieve of Eratosthenes-------------------------- //
        // CountNonDivisible
        println("CountNonDivisible")
        println(solutionLesson11Ver1(intArrayOf(3, 1, 2, 3, 6)).contentToString() + "\n------------------")
        // CountSemiprimes
        println("CountSemiprimes")
        println(solutionLesson11Ver2(26, intArrayOf(1, 4, 16), intArrayOf(26, 10, 20)).contentToString() + "\n------------------")
        //---------------------------- Euclidean algorithm---------------------------- //
        // ChocolatesByNumbers
        println("ChocolatesByNumbers")
        println(solutionLesson12Ver1(10, 4).toString() + "\n------------------")
        // CommonPrimeDivisors
        println("CommonPrimeDivisors")
        println(solutionLesson12Ver2(intArrayOf(15, 10, 3), intArrayOf(75, 30, 5)).toString() + "\n------------------")
        //---------------------------- Fibonacci numbers------------------------------ //
        // FibFrog
        println("FibFrog")
        println(solutionLesson13Ver1(intArrayOf(0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0)).toString() + "\n------------------")
        // Ladder
        println("Ladder")
        println(solutionLesson13Ver2(intArrayOf(4, 4, 5, 5, 1), intArrayOf(3, 2, 4, 3, 1)).contentToString() + "\n------------------")
        //---------------------------- Binary search algorithm------------------------ //
        // MinMaxDivision
        println("MinMaxDivision")
        println(solutionLesson14Ver1(3, intArrayOf(2, 1, 5, 1, 2, 2, 2)).toString() + "\n------------------")
        // NailingPlanks
        println("NailingPlanks")
        println(solutionLesson14Ver2(intArrayOf(1, 4, 5, 8), intArrayOf(4, 5, 9, 10), intArrayOf(4, 6, 7, 10, 2)).toString() + "\n------------------")
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
        println(solutionLesson92Ver4())
        println(solutionLesson92Ver4().toString() + "\n------------------")
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
