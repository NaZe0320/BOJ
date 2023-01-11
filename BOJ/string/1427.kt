package level_10

fun main() {
    val x = readln()

    val arr = ArrayList<Int>()

    x.map { arr.add(it.code-48) }
    arr.sort()
    arr.reverse()

    for (i in arr) {
        print(i)
    }
}