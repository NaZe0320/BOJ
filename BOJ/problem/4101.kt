package problem

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    while (true) {
        val (a,b) = br.readLine().split(" ").map { it.toInt() }
        if (a==0 && b==0) break
        if (a>b) bw.write("Yes\n")
        else bw.write("No\n")
    }
    bw.flush()
    bw.close()
}