package class3

//피보나치 함수


fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val cnt = Array(41) {Array(2) {0} }

    cnt[0] = arrayOf(1,0)
    cnt[1] = arrayOf(0,1)
    val x = br.readLine().toInt()
    repeat(x) {
        val n = br.readLine().toInt()
        for (i in 2..n) {
            cnt[i][0] = cnt[i-1][0] + cnt[i-2][0]
            cnt[i][1] = cnt[i-1][1] + cnt[i-2][1]
        }
        bw.write("${cnt[n][0]} ${cnt[n][1]}\n")
    }
    bw.flush()
    bw.close()
}
