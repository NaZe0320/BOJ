package level_06

fun main() {
    val n = readln().split(" ")

    val a = arrayListOf<Int>()

    for (i in n) {
        var s = ""
        for (j in i) {
            s = j + s
        }
        a.add(s.toInt())
    }

    if (a[0] > a[1]) {
        print(a[0])
    } else {
        print(a[1])
    }
}