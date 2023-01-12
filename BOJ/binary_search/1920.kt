package binary_search

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val arr1 = br.readLine().split(" ").map { it.toInt() }.sorted()
    val m = br.readLine().toInt()

    br.readLine().split(" ").map {
        bw.write("${binarySearch(arr1, it.toInt())}\n")
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