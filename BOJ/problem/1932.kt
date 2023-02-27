package problem

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val arr = Array(n) {Array(n+1) {0} }

    repeat(n) { i ->
        arr[i] = br.readLine().split(" ").map { it.toInt() }.toTypedArray()
    }

    for ( i in n-2 downTo 0) {
        for (j in 0 .. i) {
            arr[i][j] += maxOf(arr[i+1][j],arr[i+1][j+1])
        }
    }
    bw.write("${arr[0][0]}")
    bw.flush()
    bw.close()
}