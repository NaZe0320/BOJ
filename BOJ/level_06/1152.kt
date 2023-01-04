package level_06

fun main() {
    val x = readln().split(" ")
    var count = 0
    repeat(x.size) {
        if (x[it].isNotEmpty()) {
            count ++
        }
    }
    print(count)
}