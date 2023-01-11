package level_06

fun main() {
    val n = readln().toInt()

    repeat(n) {
        val x = readln().split(" ")
        for (i in x[1])
            repeat(x[0].toInt()) {
                print(i)
            }
        println()
    }
}