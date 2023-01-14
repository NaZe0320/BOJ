package binary_search

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (n,k) = br.readLine().split(" ").map { it.toInt()}
    val arr = br.readLine().split(" ").map { it.toInt() }

    var bot: Long = 1
    var top: Long = arr.max().toLong()
    var mid:Long = 0

    while (bot <= top) {
        mid = (bot+top)/2

        var sum:Long = 0
        for (i in arr) {
            if (i > mid) {
                sum += (i-mid)
            }
        }
        if (sum >= k) {
            bot = mid + 1
        } else {
            top = mid - 1
        }
    }
    println(top)
}