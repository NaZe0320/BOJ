package level_08

import kotlin.math.sqrt

fun main() {
    val x = readln().split(" ")
    var a = x[0].toInt()
    val b = x[1].toInt()

    var check = true
    if (a == 1) {
        a += 1
    }
    for (i in a..b) {
        for (j in 2..sqrt(i.toDouble()).toInt()) {
            if (i%j==0) {
                check = false
                break
            }
        }
        if (check) {
            println(i)
        }
        check = true
    }
}