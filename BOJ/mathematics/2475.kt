package mathematics

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val num = br.readLine().split(" ").map { it.toInt() }

    var sum = 0
    for (i in num) {
        sum += i * i
    }
    bw.write("${sum%10}")
    bw.flush()
    bw.close()
}