package level_08

import kotlin.math.sqrt

fun main() {
    var n = readln().toInt()

    while (n != 1) {
        for (i in 2..n) {
            while (n % i == 0) {
                println(i)
                n /= i
            }
        }
    }
}