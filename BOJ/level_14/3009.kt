package level_14

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val a = br.readLine().split(" ").map { it.toInt() }
    val b = br.readLine().split(" ").map { it.toInt() }
    val c = br.readLine().split(" ").map { it.toInt() }
    val d = Array(2) {0}

    if (a[0] == b[0]) {
        d[0] = c[0]
    } else if (a[0] == c[0]) {
        d[0] = b[0]
    } else if (b[0] == c[0]){
        d[0] = a[0]
    }

    if (a[1] == b[1]) {
        d[1] = c[1]
    } else if (a[1] == c[1]) {
        d[1] = b[1]
    } else if (b[1] == c[1]){
        d[1] = a[1]
    }
    bw.write("${d[0]} ${d[1]}")
    bw.flush()
    bw.close()
}