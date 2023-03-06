package graphs

import java.util.LinkedList

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (n,k) = br.readLine().split(" ").map { it.toInt() }

    val arr = Array(100001) {0}

    val queue = LinkedList<Int>()
    queue.offer(n)

    while (!queue.isEmpty()) {
        val now = queue.poll()
        if (now == k) break
        if (now - 1 >= 0 && arr[now-1] == 0) {
            queue.offer(now-1)
            arr[now-1] = arr[now] + 1
        }
        if (now +1 <= 100000 && arr[now+1] == 0) {
            queue.offer(now+1)
            arr[now+1] = arr[now] + 1
        }
        if (now *2 <= 100000 && arr[now*2] == 0) {
            queue.offer(now*2)
            arr[now*2] = arr[now] + 1
        }
    }
    bw.write("${arr[k]}")
    bw.flush()
    bw.close()
}