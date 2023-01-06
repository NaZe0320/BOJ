package level_08

import kotlin.math.sqrt

fun main() {
    val n = readln().length
    var check = true
    var count = 0

    val x = readln().split(" ")
    for (i in x) {
        val a = i.toInt()
        if (a == 1) {
            check = false
        } else {
            for (j in 2..sqrt(a.toDouble()).toInt()) {
                if (a % j == 0) {
                    check = false
                    break
                }
            }
        }
        if (check) {
            count ++
        }
        check = true
    }
    println(count)
}