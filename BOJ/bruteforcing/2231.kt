package level_12

fun main() {
    val x = readln()
    val n = x.toInt()
    var min = 0
    var sum = 0

    for (i in n - x.length * 9..n ) {
        sum += i
        i.toString().map { sum += (it.toInt() - 48) }
        if (sum == n) {
            min = i
            break
        } else {
            sum = 0
        }
    }
    println(min)
}