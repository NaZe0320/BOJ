package level_14

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (x,y,w,h) = br.readLine().split(" ").map { it.toDouble() }

    val a = if (x >= w/2) w - x else x
    val b = if (y >= h/2) h - y else y
    val min = if (a>=b) b else a
    bw.write("${min.toInt()}")
    bw.flush()
    bw.close()
}