package implementation

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    repeat( br.readLine().toInt() ) {
        bw.write("${it+1}\n")
    }
    bw.flush()
    bw.close()
}