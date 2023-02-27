package problem

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val arr = Array(n+1) {0}
    val dp = Array(n+1) {Array(2) {0} }
    repeat(n) {
        arr[it+1] = br.readLine().toInt()
    }
    dp[1][0] = arr[1]
    dp[1][1] = arr[1]
    for (i in 2..n) {
        dp[i][0] = dp[i-1][1] + arr[i]
        dp[i][1] = maxOf(dp[i-2][0], dp[i-2][1]) + arr[i]
    }

    bw.write("${maxOf(dp[n][0], dp[n][1])}")
    bw.flush()
    bw.close()
    br.close()
}