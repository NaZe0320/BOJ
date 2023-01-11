package level_05

fun main() {
    val x = readln().toInt()
    var cnt = 0
    for (i in 1..x)
        if (han(i))
            cnt++
    println(cnt)
}

fun han(n : Int): Boolean {
    val arr: ArrayList<Int> = ArrayList()
    val map = n.toString().map { arr.add(it.code - 48) }

    return if (arr.size == 3) {
        if ((arr[0] + arr[2])%2==0) {
            arr[1] == (arr[0] + arr[2])/2
        } else {
            false
        }
    } else arr.size != 4
}