package level_15

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val x = br.readLine().toInt()
    val arr1 = Array(x) {0}
    val arr2 = Array(x-1) {0}
    val arr = ArrayList<Int>()

    repeat(x) { i ->
        arr1[i] = br.readLine().toInt()
    }

    arr1.sort()

    for (i in 0 until x-1) {
        arr2[i] = arr1[i+1] - arr1[i]
    }
    arr2.sort()
    for (i in 2..arr2[0]) {
        var cnt = 0
        for (j in arr2) {
            if (j%i!=0) {
                cnt++
                break
            }
        }
        if (cnt==0) {
            arr.add(i)
        }
    }

    for (i in arr) {
        bw.write("$i ")
    }
    bw.flush()
    bw.close()
}