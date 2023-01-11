package level_10

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val x = br.readLine().toInt()

    val arr = br.readLine().split(" ").map { it.toInt() }
    val arr1 = ArrayList<Int>()
    val arr2 = arr.distinct().sorted()

    for (i in arr) {
        arr1.add(binarySearch(arr2,i))
    }
    for (i in arr1) {
        bw.write("$i ")
    }
    bw.flush()
    bw.close()
}

fun binarySearch(list: List<Int>, target: Int): Int {
    var left = 0
    var right = list.size

    while (left < right) {
        val mid = (right + left) / 2
        if (list[mid] >= target) {
            right = mid
        } else {
            left = mid + 1
        }
    }
    return left
}