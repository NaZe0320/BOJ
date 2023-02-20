package problem

import kotlin.math.min


fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()

    val arr = Array(1000001) {0}
    arr[1] = 0
    for (i in 2..n) {
        arr[i] = arr[i-1]+1
        if (i%6==0) {
            arr[i] = min(min(arr[i/3], arr[i/2]), arr[i-1]) + 1
        } else if (i%2==0) {
            arr[i] = min(arr[i/2], arr[i-1]) + 1
        } else if (i%3==0) {
            arr[i] = min(arr[i/3], arr[i-1]) + 1
        }
    }
    bw.write("${arr[n]}")
    bw.flush()
    bw.close()
}

