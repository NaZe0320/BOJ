package dp

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val arr = br.readLine().split(" ").map { it.toInt() }

    val sumArr = ArrayList<Int>()

    sumArr.add(0,0)
    for (i in 1..arr.size) {
        sumArr.add(i, sumArr[i-1]+arr[i-1])
    }

    repeat(m) {
        val (a,b) = br.readLine().split(" ").map { it.toInt() }
        bw.write("${sumArr[b]-sumArr[a-1]}")
        bw.newLine()
    }
    bw.flush()
    bw.close()
}