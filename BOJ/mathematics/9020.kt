package level_08

import kotlin.math.abs
import kotlin.math.sqrt

fun main() {
    val x = readln().toInt()

    var min = 10000
    var c = 0

    repeat(x) {
        var n = readln().toInt()
        if (n == 4) {
            println("2 2")
        } else {
            for (i in 3..n) {
                if (prime(i)) {
                    if (prime(n - i)) {
                        if (abs(i - (n - i)) < min) {
                            min = abs(i - (n - i))
                            c = i
                        }
                    }
                }
            }
            min = 10000
            println("$c ${n - c}")
        }
    }
}

fun prime(i: Int): Boolean {
    var check = true
    for (j in 2..sqrt(i.toDouble()).toInt()) {
        if (i%j==0) {
            check = false
            break
        }
    }
    return check
}