package graphs

import java.util.LinkedList

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (n,m) = br.readLine().split(" ").map { it.toInt() }
    val arr = Array(n+1) { ArrayList<Int>() }
    val visit = Array(n+1) {true}

    repeat(m) {
        val (u,v) = br.readLine().split(" ").map { it.toInt() }
        arr[u].add(v)
        arr[v].add(u)
    }

    val queue = LinkedList<Int>()
    var cnt = 0
    for (i in 1 .. n) {
        if (visit[i]) {
            queue.offer(i)
            cnt++
        }
        while (queue.isNotEmpty()) {
            val now = queue.poll()

            for (j in arr[now]) {
                if (visit[j]) {
                    queue.offer(j)
                    visit[j] = false
                }
            }
        }
    }
    bw.write("$cnt")
    bw.flush()
    bw.close()
}