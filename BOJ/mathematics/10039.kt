package mathematics

fun main() {
    val br = System.`in`.bufferedReader()

    var sum = 0
    repeat(5) {
        val n = br.readLine().toInt()
        sum += if (n<40) 40 else n
    }
    println((sum/5))
}