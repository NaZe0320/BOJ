package level_10

import kotlin.math.round

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val arr = IntArray(n)
    val arr2 = IntArray(8001)

    repeat(n) {
        arr[it] = br.readLine().toInt()
        arr2[arr[it]+4000]++
    }

    bw.write("${round(arr.average()).toInt()}\n")
    arr.sort()
    bw.write("${arr[n/2]}\n")
    var max = -1
    var cnt = 0
    var c = 0
    for (i in 0..8000) {
        if (max < arr2[i]) {
            max = arr2[i]
            cnt = 1
            c = i-4000
        } else if (max == arr2[i]) {
            cnt ++
            if (cnt == 2) {
                c = i-4000
            }
        }
    }
    bw.write("${c}\n")
    bw.write("${arr.max()-arr.min()}\n")
    bw.flush()
    bw.close()
}