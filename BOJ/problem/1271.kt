package problem

fun main() {
    val br = System.`in`.bufferedReader()
    val (n,m) = br.readLine().split(" ").map { it.toBigInteger() }

    println(n/m)
    println(n%m)
}