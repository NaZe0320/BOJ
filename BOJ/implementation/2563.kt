package level_09

fun main() {
    val arr = Array<Array<Int>>(100) { Array<Int>(100) {0} }

    val n = readln().toInt()

    repeat(n) {
        val x = readln().split(" ")
        val a = x[0].toInt()
        val b = x[1].toInt()

        for (i in a until a+10) {
            for (j in b until b+10) {
                arr[i][j] = 1
            }
        }
    }
    var cnt = 0
    for(i in 0 until 100) {
        for (j in 0 until 100) {
            if (arr[i][j] == 1) {
                cnt ++
            }
        }
    }
    println(cnt)
}