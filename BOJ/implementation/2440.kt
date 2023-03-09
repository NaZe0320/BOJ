package implementation

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()

    for (i in n downTo 1) {
        repeat(i) {
            bw.write("*")
        }
        bw.newLine()
    }
    bw.flush()
    bw.close()
}