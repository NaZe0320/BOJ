package level_10

fun main() {
    val n = readln().toInt()

    val arr = ArrayList<Int>()
    repeat(n) {
        arr.add(readln().toInt())
    }
    arr.sort()

    for (i in arr) {
        println(i)
    }
}