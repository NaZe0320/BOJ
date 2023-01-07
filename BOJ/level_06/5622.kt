package level_06

fun main() {

    val arr = readln()
    var time = 0
    for (n in arr) {
        time += when (n) {
            'A', 'B', 'C' -> 3
            'D', 'E', 'F' -> 4
            'G', 'H', 'I' -> 5
            'J', 'K', 'L' -> 6
            'M', 'N', 'O' -> 7
            'P', 'Q', 'R', 'S' -> 8
            'T', 'U', 'V' -> 9
            'W', 'X', 'Y', 'Z' -> 10
            else -> 2
        }
    }
    println(time)
}