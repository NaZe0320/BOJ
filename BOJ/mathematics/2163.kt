package mathematics

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (n,m) = br.readLine().split(" ").map {it.toInt()}

    if (n > m) {
        bw.write("${(n-1) + (m-1) * n}")
    } else {
        bw.write("${(m-1) + (n-1) * m}")
    }
    bw.flush()
    bw.close()
}