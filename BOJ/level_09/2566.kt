package level_09

fun main() {

    val arr = setArray(9)

    var max = 0
    var n = 1
    var m = 1

    for (i in 0 until 9) {
        for (j in 0 until 9) {
            if (max < arr[i][j]) {
                max = arr[i][j]
                n = i
                m = j
            }
        }
    }
    println(max)
    println("${n+1} ${m+1}")
}

/*
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
}*/
