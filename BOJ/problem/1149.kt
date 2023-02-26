package problem

import java.lang.Integer.min

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()

    val price = Array(n+1) {Array(3){0} }
    val dp = Array(n+1) {Array(3){0} }
    repeat(n) { cnt ->
        price[cnt+1] = br.readLine().split(" ").map { it.toInt() }.toTypedArray()
    }

    dp[1] = price[1]
    for (i in 2..n) {
        dp[i][0] = min(dp[i-1][1], dp[i-1][2])+price[i][0]
        dp[i][1] = min(dp[i-1][0], dp[i-1][2])+price[i][1]
        dp[i][2] = min(dp[i-1][0], dp[i-1][1])+price[i][2]
    }

    bw.write("${minOf(dp[n][0],dp[n][1],dp[n][2])}")
    bw.flush()
    bw.close()
}

