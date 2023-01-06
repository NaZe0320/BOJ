package level_09

fun main() {
    val nm = readln().split(" ")
    val n = nm[0].toInt()
    val m = nm[1].toInt()

    val arr1:ArrayList<ArrayList<Int>> = setArray(n)
    val arr2:ArrayList<ArrayList<Int>> = setArray(n)

    for (i in 0 until n) {
        for (j in 0 until m) {
            print("${arr1[i][j] + arr2[i][j]} ")
        }
        println()
    }
}

fun setArray(n: Int): ArrayList<ArrayList<Int>> {
    val array = ArrayList<ArrayList<Int>>()
    for (i in 0 until n) {
        val x = readln().split(" ")
        val arr = ArrayList<Int>()
        for (j in x) {
            arr.add(j.toInt())
        }
        array.add(arr)
    }
    return array
}