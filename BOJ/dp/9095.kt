package dp

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val dp = Array(11) {0}
    dp[1] = 1; dp[2] = 2; dp[3] = 4

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()

        for (i in 4..n) {
            if (dp[i] == 0) {
                dp[i] = dp[i-3] + dp[i-2] + dp[i-1]
            }
        }
        bw.write("${dp[n]}\n")
    }
    bw.flush()
    bw.close()
}