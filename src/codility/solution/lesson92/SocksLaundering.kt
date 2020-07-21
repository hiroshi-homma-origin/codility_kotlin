package codility.solution.lesson92

object SocksLaundering {
    fun solutionLesson92Ver2(K: Int, C: IntArray, D: IntArray): Int {
        var k = K
        var res = 0
        var maxClean = C[0]
        for (aC1 in C) if (aC1 > maxClean) maxClean = aC1
        val typesInClean = IntArray(maxClean)
        for (aC in C) typesInClean[aC - 1]++
        for (i in 0 until maxClean) {
            res += typesInClean[i] / 2
            typesInClean[i] = if (typesInClean[i] % 2 == 0) 0 else 1
        }
        var maxDirty = D[0]
        for (aD in D) if (aD > maxDirty) maxDirty = aD
        val typesInDirty = IntArray(maxDirty)
        for (aD in D) typesInDirty[aD - 1]++
        var i = 0
        while (k > 0 && i < maxClean) {
            if (typesInClean[i] == 1 && i < maxDirty) {
                if (typesInDirty[i] >= 1) {
                    typesInDirty[i]--
                    res++
                    k--
                }
            }
            i++
        }
        i = 0
        while (k > 1 && i < maxDirty) {
            while (typesInDirty[i] / 2 > 0 && K > 1) {
                res++
                k -= 2
                typesInDirty[i] -= 2
            }
            i++
        }
        return res
    }
}
