package data_structure.queue

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine().toInt()

    var dq = ArrayDeque<Int>()
    repeat(n) {
        dq.addFirst(it+1)
    }
    while (dq.size > 1) {
        dq.removeLast()
        dq.addFirst(dq.last())
        dq.removeLast()
    }
    println(dq.first())
}