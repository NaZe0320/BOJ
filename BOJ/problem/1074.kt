package problem

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val (n,r,c) = br.readLine().split(" ").map { it.toInt() }

    var cnt = 1
    repeat(n) { cnt *= 2 }
    var sum = 0
    var x = c+1; var y = r+1
    while (cnt > 1) {
        cnt /= 2
        if (x <= cnt) {
            if (y <= cnt) {
                sum += 0
            } else {
                y -= cnt
                sum += 2 * cnt * cnt
            }
        } else {
            if (y <= cnt) {
                x -= cnt
                sum += 1 * cnt * cnt
            } else {
                x -= cnt
                y -= cnt
                sum += 3 * cnt * cnt
            }
        }
    }

    bw.write("$sum")
    bw.flush()
    bw.close()
}