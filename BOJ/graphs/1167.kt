package graphs

private lateinit var visit: BooleanArray
private lateinit var graph: MutableList<MutableList<Int>>
private lateinit var dist: MutableList<MutableList<Int>>

private var end = 0
private var answer = 0

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    graph = MutableList(n+1) { mutableListOf<Int>() }
    dist = MutableList(n+1) { mutableListOf<Int>() }

    repeat(n) {
        val line = br.readLine().split(" ").map { it.toInt() }
        val a = line[0]
        for (i in 1 until line.size) {
            if (line[i] == -1) break
            if (i%2 == 1 ) {
                graph[a].add(line[i])
            } else {
                dist[a].add(line[i])
            }
        }
    }

    visit = BooleanArray(n+1) {false}
    dfs(1,0)
    visit = BooleanArray(n+1) {false}
    dfs(end, 0)
    bw.run { write("$answer");flush();close() }

}

private fun dfs(node: Int, dis: Int) {
    visit[node] = true
    if (answer < dis) {
        answer = dis
        end = node
    }
    for (i in graph[node].indices) {

        val nextDist = dis + dist[node][i]
        val next = graph[node][i]
        if (!visit[next]) dfs(next,nextDist)
    }
}