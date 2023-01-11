package level_08

import kotlin.math.sqrt

fun main() {
    var a = readln().toInt()
    val b = readln().toInt()

    var check = true
    var sum = 0
    var min = -1
    var count = 0

    if (a == 1) {
        a ++
    }
    for (i in a..b) {
        for (j in 2..sqrt(i.toDouble()).toInt()) {
            if (i%j==0) {
                check = false
                break
            }
        }
        if (check) {
            sum += i
            count ++
            if (count == 1) {
                min = i
            }
        }
        check = true
    }
    if (count >= 1) {
        println(sum)
    }
    println(min)
}