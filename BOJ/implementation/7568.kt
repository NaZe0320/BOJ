package level_12

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    var x = br.readLine().toInt()

    val arr = Array<Array<Int>> (x) {Array<Int>(2) {0}}
    val arr2 = Array<Int> (x) {1}

    repeat(x) { i->
        arr[i] = br.readLine().split(" ").map { it.toInt() }.toTypedArray()
    }

    for (i in arr.indices) {
        for (j in arr.indices) {
            if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1])
                arr2[i] ++
        }
    }

    for (i in arr2) {
        bw.write("$i ")
    }
    bw.flush()
    bw.close()
}