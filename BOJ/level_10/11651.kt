package level_10

import java.util.Arrays

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val x = br.readLine().toInt()

    val arr = Array(x) { IntArray(2) }

    repeat(x) {
            i -> br.readLine().split(" ").map { it.toInt() }
        .let {
            arr[i][0] = it[0]
            arr[i][1] = it[1]
        }
    }
    Arrays.sort(arr) { a, b ->
        if (a[1] == b[1])
            return@sort a[0] - b[0]
        else
            return@sort a[1] - b[1]
    }
    repeat(x) {
        bw.write("${arr[it][0]} ${arr[it][1]}\n")
    }
    bw.flush()
    bw.close()
}