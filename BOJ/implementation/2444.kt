package implementation

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()

    for (i in 1..n) {
        repeat(n-i) {
            bw.write(" ")
        }
        repeat(i*2-1) {
            bw.write("*")
        }
        bw.newLine()
    }
    for (i in n-1 downTo 1) {
        repeat(n-i) {
            bw.write(" ")
        }
        repeat(i*2-1) {
            bw.write("*")
        }
        bw.newLine()
    }
    bw.flush()
    bw.close()
}