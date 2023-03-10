package implementation

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()

    repeat(n-1) {
        bw.write(" ")
    }
    bw.write("*")
    bw.newLine()
    for (i in 2 .. n) {
        repeat(n-i) {
            bw.write(" ")
        }
        bw.write("*")
        repeat(i*2-3) {
            bw.write(" ")
        }
        bw.write("*")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}