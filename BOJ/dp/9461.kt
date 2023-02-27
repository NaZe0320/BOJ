package dp

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val t = br.readLine().toInt()

    repeat(t) {
        val n = br.readLine().toInt()

        val dp = Array(n+1) {0L}

        dp[1] = 1;
        if (n>1) dp[2] = 1
        if (n>2) dp[3] = 1
        if (n>3) dp[4] = 2

        for (i in 5..n) {
            dp[i] = (dp[i-5] + dp[i-1])
        }
        bw.write("${dp[n]}\n")
    }
    bw.flush()
    bw.close()
}