package level_15

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    do {
        val (n, m) = br.readLine().split(" ").map { it.toInt() }
        if (n==0 && m==0) {
            break
        }
        if (n > m) {
            if (n%m==0) {
                bw.write("multiple\n")
            } else {
                bw.write("neither\n")
            }
        } else {
            if (m%n==0) {
                bw.write("factor\n")
            } else {
                bw.write("neither\n")
            }
        }
    } while(true)

    bw.flush()
    bw.close()
}