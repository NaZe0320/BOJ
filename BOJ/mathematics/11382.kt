package mathematics

fun main() {
    val br = System.`in`.bufferedReader()

    val arr = br.readLine().split(" ").map { it.toLong() }
    var sum:Long = 0
    for (i in arr) {
        sum += i
    }
    println("$sum")
}