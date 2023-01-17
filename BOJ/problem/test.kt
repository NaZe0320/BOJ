package problem

import kotlin.math.sqrt

fun main() {
    var num = 1234
    var answer = -1
    var k = 1
    for (i in num.toString().indices) {
        if (k.toString() == num.toString()[i].toString()) answer = i+1
    }
    println(answer)
}