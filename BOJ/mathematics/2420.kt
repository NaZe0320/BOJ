package mathematics

import kotlin.math.abs

fun main() {
    val br = System.`in`.bufferedReader()

    val (n,m) = br.readLine().split(" ").map { it.toLong() }
    println(abs(n-m))
}