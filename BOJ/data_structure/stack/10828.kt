package data_structure.stack

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine().toInt()
    val dq = Stack<Int>()
    repeat(n) {
        val m = br.readLine().split(" ")
        when (m[0]) {
            "push" -> {
                dq.push(m[1].toInt())
            }
            "pop" -> {
                if (dq.size >= 1) {
                    bw.write("${dq.pop()}\n")
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
            "top" -> {
                if (dq.size >= 1) {
                    bw.write("${dq.peek()}\n")
                } else {
                    bw.write("-1\n")
                }
            }
        }
    }
    bw.flush()
    bw.close()
}