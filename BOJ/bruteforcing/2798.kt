package level_12

fun main() {
    val x = readln().split(" ")
    val n = x[0].toInt()

    val arr = readln().split(" ", limit = x[0].toInt())

    var max = -1
    var sum = 0

    for (i in 0 until n) {
        for (j in i+1 until n) {
            for (k in j+1 until n) {
                sum = arr[i].toInt() + arr[j].toInt() + arr[k].toInt()
                if (sum <= x[1].toInt()) {
                    if (max <= sum) {
                        max = sum
                    }
                }
            }
        }
    }
    println(max)
}