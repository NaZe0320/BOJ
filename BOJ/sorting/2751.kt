package level_10

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = readln().toInt()

    val array = Array<Int>(n) {0}

    repeat(n) {
        array[it] = readln().toInt()
    }
    mergeSort(array)

    for (i in array) {
        bw.write("$i\n")
    }
    bw.flush()
}

fun mergeSort(array: Array<Int>) {
    mergeSortRe(array, 0, array.size - 1)
}

fun mergeSortRe(array: Array<Int>, left:Int, right:Int) {
    if (left<right) {
        val mid = left + (right - left) /2
        mergeSortRe(array, left, mid)
        mergeSortRe(array, mid + 1, right)
        merge(array, left, right, mid)
    }
}

fun merge(array: Array<Int>, left: Int, right: Int, mid: Int) {
    val tmp1 = mid - left + 1
    val tmp2 = right - mid

    val arr1 = Array<Int>(tmp1) {0}
    val arr2 = Array<Int>(tmp2) {0}
    for ( i in 0 until tmp1) {
        arr1[i] = array[left+i]
    }
    for ( i in 0 until tmp2) {
        arr2[i] = array[mid + 1 + i]
    }
    var i = 0
    var j = 0
    var k = left

    while (i < tmp1 && j < tmp2) {
        if (arr1[i] <= arr2[j]) {
            array[k] = arr1[i]
            i++
        } else {
            array[k] = arr2[j]
            j++
        }
        k++
    }
    while(i < tmp1) {
        array[k] = arr1[i]
        i++
        k++
    }
    while (j < tmp2) {
        array[k] = arr2[j]
        j++
        k++
    }
}