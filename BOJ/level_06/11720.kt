package level_06

fun main() {
    val n = readln().toInt()
    val x = readln().chunked(1)

    var sum =0
    for (i in x) {
        sum +=i.toInt()
    }
    print(sum)
}