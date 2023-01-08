package level_10

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val x = br.readLine().toInt()

    val arr = ArrayList<List<String>>()
    val arr2 = ArrayList<List<String>>()

    repeat(x) {
        arr.add(br.readLine().split(" "))
    }

    for (i in 1..200) {
        if (arr.size > 0) {
            for (j in arr.indices) {
                if (arr[j][0].toInt() == i) {
                    arr2.add(arr[j])
                }
            }
        } else {
            break
        }
    }
    for (i in arr2.indices) {
        bw.write("${arr2[i][0]} ${arr2[i][1]}\n")
    }
    bw.flush()
    bw.close()
}