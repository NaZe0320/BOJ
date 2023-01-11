package level_10

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val x = br.readLine().toInt()
    var array = mutableListOf<String>()

    val arr1 = ArrayList<String>()
    var arr2 = ArrayList<String>()

    repeat(x) {
        array.add(br.readLine())
    }
    var arr0: List<String> = array
    arr0 = arr0.distinct()

    for (i in 1..50) {
        for (j in arr0) {
            if (j.length == i) {
                arr2.add(j)
            }
        }
        arr2.sort()
        for (j in arr2) {
            arr1.add(j)
        }
        arr2.clear()
    }
    for (i in arr1) {
        bw.write("$i\n")
    }
    bw.flush()
    bw.close()
}