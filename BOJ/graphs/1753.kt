package graphs

import java.util.PriorityQueue

private const val INF = Int.MAX_VALUE
private lateinit var graph: Array<ArrayList<Node>>

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val start = br.readLine().toInt()

    graph = Array(n+1) { arrayListOf() }

    repeat(m) {
        val (u,v,w) = br.readLine().split(" ").map { it.toInt() }
        graph[u].add(Node(v,w))
    }
    val time = dijkstra(graph, start)

    for (i in 1 until time.size) {
        if (time[i] >= INF) bw.write("INF\n")
        else bw.write("${time[i]}\n")
    }
    bw.flush()
    bw.close()
}

private fun dijkstra(graphs: Array<ArrayList<Node>>, start: Int): IntArray {
    val time = IntArray(graphs.size) {INF}
    time[start] = 0

    val queue = PriorityQueue<Node>()
    queue.add(Node(start,0))

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        for (i in graphs[now.node]) {
            if (time[i.node] > time[now.node]+i.time) {
                time[i.node] = time[now.node]+i.time
                queue.add(Node(i.node, time[i.node]))
            }
        }
    }
    return time
}

private data class Node(val node: Int, val time: Int): Comparable<Node> {
    override fun compareTo(other: Node): Int {
        return time - other.time
    }
}