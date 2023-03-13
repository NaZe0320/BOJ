package graphs

import java.util.PriorityQueue


private const val INF = 1000 * 100 + 1
private lateinit var graph: Array<ArrayList<Node>>
private lateinit var reverseGraph: Array<ArrayList<Node>>
fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (n, m, x) = br.readLine().split(" ").map { it.toInt() }

    graph = Array(n+1) { arrayListOf() }
    reverseGraph = Array(n+1) { arrayListOf() }

    repeat(m) {
        val (start, end, time) = br.readLine().split(" ").map { it.toInt() }
        graph[start].add(Node(end, time))
        reverseGraph[end].add(Node(start, time))
    }
    val time = dijkstra(graph,x)
    val reverseTime = dijkstra(reverseGraph, x)
    var result = Int.MIN_VALUE
    for (i in 1 until graph.size)
        result = maxOf(result, time[i] + reverseTime[i])

    bw.run { write("$result");flush();close() }
}
private fun dijkstra(graphs: Array<ArrayList<Node>>, start: Int): IntArray {
    val time = IntArray(graphs.size) { INF }
    time[start] = 0

    val queue = PriorityQueue<Node>()
    queue.add(Node(start,0))

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        for (i in graphs[now.node]) {
            if (time[i.node] > time[now.node] + i.dist) {
                time[i.node] = time[now.node] + i.dist
                queue.add(Node(i.node, now.dist + i.dist))
            }
        }
    }
    return time
}

private data class Node(val node: Int, val dist: Int): Comparable<Node> {
    override fun compareTo(other: Node): Int {
        return dist - other.dist
    }

}