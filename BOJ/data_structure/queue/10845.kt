package data_structure.queue

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine().toInt()
    val dq = ArrayDeque<Int>()
    repeat(n) {
        val m = br.readLine().split(" ")
        when (m[0]) {
            "push" -> {
                dq.addFirst(m[1].toInt())
            }
            "pop" -> {
                if (dq.size >= 1) {
                    bw.write("${dq.last()}\n")
                    dq.removeLast()
                } else {
                    bw.write("-1\n")
                }
            }
            "size" -> {
                bw.write("${dq.size}\n")
            }
            "empty" -> {
                if (dq.isEmpty()) {
                    bw.write("1\n")
                } else {
                    bw.write("0\n")
                }
            }
            "front" -> {
                if (dq.size >= 1) {
                    bw.write("${dq.last()}\n")
                } else {
                    bw.write("-1\n")
                }
            }
            "back" -> {
                if (dq.size >= 1) {
                    bw.write("${dq.first()}\n")
                } else {
                    bw.write("-1\n")
                }
            }
        }
    }
    bw.flush()
    bw.close()
}