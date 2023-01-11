package mathematics

fun main() {
    val m = readln().split(" ")
    val a = m[0].toInt()
    val b = m[1].toInt()
    val c = m[2].toInt()

    if (b>=c) {
        print(-1)
    } else {
        print(a/(c-b)+1)
    }
}
