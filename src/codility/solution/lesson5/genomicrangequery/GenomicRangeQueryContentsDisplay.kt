package codility.solution.lesson5.genomicrangequery

import codility.solution.lesson5.GenomicRangeQuery

object GenomicRangeQueryContentsDisplay {
    @JvmStatic
    fun main(args: Array<String>) {
        //---------------------------- Prefix Sums ----------------------------------------- //
        println("GenomicRangeQuery")
        println(GenomicRangeQuery.solutionLesson5Ver2("CAGCCTA", intArrayOf(2, 5, 0), intArrayOf(4, 5, 6)).contentToString() + "\n------------------")
    }
}