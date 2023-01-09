package level_14

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    do {
        var n = br.readLine().split(" ").map { it.toInt() }
        n = n.sorted()
        if (!(n[0]==0 && n[1]==0 && n[2]==0)) {
            if (n[0]*n[0]+n[1]*n[1]==n[2]*n[2]) {
                bw.write("right\n")
            } else {
                bw.write("wrong\n")
            }
        } else {
            break
        }
    } while (true)

    bw.flush()
    bw.close()
}