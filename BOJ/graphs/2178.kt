/*
package graphs

import java.util.LinkedList

private val dx = arrayOf(1,0,-1,0)
private val dy = arrayOf(0,-1,0,1)
private lateinit var visited: Array<Array<Int>>

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (x,y) = br.readLine().split(" ").map { it.toInt() }
    val arr = Array(x) { Array(y) {0} }
    visited = Array(x) {Array(y) {-1} }
    repeat(x) {
        br.readLine().forEachIndexed { y, c ->
            arr[it][y] = c.code-48
        }
    }
    BFS(x,y,arr)
    bw.write("${visited[x-1][y-1]}")
    bw.flush()
    bw.close()
}

private fun BFS(x:Int,y: Int, arr: Array<Array<Int>>) {
    val queue = LinkedList<Node>()
    queue.offer(Node(0,0))
    visited[0][0] = 1

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        for (i in 0..3) {
            val nowX = dx[i] + now.x
            val nowY = dy[i] + now.y

            if (nowX in 0 until x && nowY in 0 until y) {
                if (arr[nowX][nowY] == 1 && visited[nowX][nowY]==-1) {
                    queue.offer(Node(nowX,nowY))
                    visited[nowX][nowY] = visited[now.x][now.y] + 1
                }
            }
        }
    }
}
private data class Node(var x: Int, var y: Int)*/
