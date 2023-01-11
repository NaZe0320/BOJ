package level_10

fun main() {
    val x = readln().split(" ")

    val arr = readln().split(" ")
    val array = ArrayList<Int>()

    for ( i in arr) {
        array.add(i.toInt())
    }

    array.sort()
    println(array[x[0].toInt() - x[1].toInt()])
}