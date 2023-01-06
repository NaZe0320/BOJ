package level_08

import kotlin.math.sqrt

fun main() {

    var n = -1

    var check = true
    var count = 0

    do {
        n = readln().toInt()

        for (i in n+1..2*n) {
            for (j in 2..sqrt(i.toDouble()).toInt()) {
                if (i%j==0) {
                    check = false
                    break
                }
            }
            if (check) {
                count++
            }
            check = true
        }
        if (n != 0) {
            println(count)
            count = 0
        }
    } while (n!=0)
}