package mathematics

fun main() {
    val br = System.`in`.bufferedReader()
    val (n,m) = br.readLine().split(" ").map { it.toInt() }

    println((n+m)*(n-m))
}