package level_13

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val x1 = br.readLine().toInt()
    val arr1 = br.readLine().split(" ").map { it.toInt() }.sorted()
    val x2 = br.readLine().toInt()
    val arr2 = br.readLine().split(" ").map { it.toInt() }
    for (i in arr2) {
        bw.write("${binarySearch(arr1,i)} ")
    }
    bw.flush()
    bw.close()
}

private fun binarySearch(list: List<Int>, target: Int): Int {
    var left = 0
    var right = list.size

    while (left < right) {
        val mid = (right + left) / 2
        if (list[mid] == target) {
            return 1
        } else if (list[mid] > target) {
            right = mid
        } else {
            left = mid + 1
        }
    }
    return 0
}