package mathematics

fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()

    var x = 5
    var sum = 0
    while (x <= n) {
        sum += n/x
        x *= 5
    }
    println(sum)
}