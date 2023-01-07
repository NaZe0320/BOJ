package level_10

fun main() {
    val arr = ArrayList<Int>()

    repeat(5) {
        arr.add(readln().toInt())
    }
    println(arr.average().toInt())
    arr.sort()
    println(arr[2])
}