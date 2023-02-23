package problem

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()

    val dp = Array(n+1) {0}

    dp[1] = 1;
    if (n>1) dp[2] = 2

    for (i in 3..n) {
        dp[i] = (dp[i-1] + dp[i-2])%10007
    }
    bw.write("${dp[n]}")
    bw.flush()
    bw.close()
}