package level_05

fun main() {
    val arr = Array<Int>(10000) {0}
    arr[0] = 1
    for (i in 1..9999) {
        val n = d(i)
        if (n < 10000)
            arr[n] = 1
    }
    for (i in arr.indices) {
        if (arr[i] == 0) {
            println(i)
        }
    }

}
fun d(n: Int): Int {
    var sum = 0
    n.toString().map { sum += (it.toInt() - 48)}
    return n + sum
}