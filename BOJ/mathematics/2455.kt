package mathematics

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    var cnt = 0
    var max = 0
    repeat(4) {
        val (a,b) = br.readLine().split(" ").map { it.toInt() }
        cnt -= a
        cnt += b
        if (cnt > max ) max = cnt
    }
    bw.write("$max")
    bw.flush()
    bw.close()
}