package problem

import kotlin.math.sqrt

fun main() {
    var array = arrayOf(1,8,3)

    var max = 0
    var idx = 0

    for ((j, i) in array.withIndex()) {
        if (i > max) {
            max = i
            idx = j
        }
    }
    intArrayOf(max, idx)
    println("$max $idx")
}