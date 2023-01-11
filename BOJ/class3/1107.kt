package class3

import kotlin.math.abs

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val m = br.readLine().toInt()

    var broken = Array(10) {false}

    if (m>0) {
        val arr = br.readLine().split(" ").map { it.toInt() }

        for (i in arr) {
            broken[i] = true
        }
    }
    if ( n == 100) {
        println(0)
    } else {
        val result = (0..1_000_000).asSequence()
            .filterNot { broken[0] && it.toString().contains("0") }
            .filterNot { broken[1] && it.toString().contains("1") }
            .filterNot { broken[2] && it.toString().contains("2") }
            .filterNot { broken[3] && it.toString().contains("3") }
            .filterNot { broken[4] && it.toString().contains("4") }
            .filterNot { broken[5] && it.toString().contains("5") }
            .filterNot { broken[6] && it.toString().contains("6") }
            .filterNot { broken[7] && it.toString().contains("7") }
            .filterNot { broken[8] && it.toString().contains("8") }
            .filterNot { broken[9] && it.toString().contains("9") }
            .map { abs(it - n) + it.toString().length }
            .filter { it < abs(n - 100) }
            .minOrNull()

        println(result ?: abs(n - 100))
    }
 }