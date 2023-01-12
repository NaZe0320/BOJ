package implementation

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    for (i in n downTo 1) {
        bw.write("$i\n")
    }
    bw.flush()
    bw.close()
}