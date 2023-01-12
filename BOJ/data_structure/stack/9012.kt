package data_structure.stack

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine().toInt()

    repeat(n) {
        val m = br.readLine()
        val dq = Stack<Char>()
        var check = true
        if (m.length%2==0) {
            for (i in m) {
                if (i=='(') {
                    dq.push(i)
                } else {
                    if (dq.size > 0) {
                        dq.pop()
                    } else {
                        check = false
                        break
                    }
                }
            }
            if (check && dq.size == 0) {
                bw.write("YES\n")
            } else {
                bw.write("NO\n")
            }

        } else {
            bw.write("NO\n")
        }
    }
    bw.flush()
    bw.close()
}