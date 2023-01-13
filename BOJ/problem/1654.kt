package problem

//@랜선 자르기
fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (n,k) = br.readLine().split(" ").map { it.toInt()}
    val arr = Array<Int>(n) {0}

    repeat(n) {arr[it] = br.readLine().toInt()  }

    var left:Long = 1
    var right:Long = arr.max().toLong()
    var mid:Long = 0

    while (left <= right) {
        mid = ((left + right)/2)

        var sum:Long = 0
        for (i in arr) {
            sum += i/mid
        }

        if (sum >= k) {
            left = (mid + 1)
        } else {
            right = (mid - 1)
        }
    }
    println(right)
}
