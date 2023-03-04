/*
package graphs

import java.util.LinkedList
import java.util.Queue

private val dx = arrayOf(1,0,-1,0)
private val dy = arrayOf(0,-1,0,1)

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (m,n) = br.readLine().split(" ").map { it.toInt() }

    val arr = Array(n) {Array(m) {-1} }
    val riped = Array(n) {Array(m) {-1} }
    repeat(n) {i ->
        arr[i] = br.readLine().split(" ").map { it.toInt() }.toTypedArray()
    }

    val queue: Queue<Node> = LinkedList()

    for (i in 0 until n) {
        for (j in 0 until m) {
            if (arr[i][j] == 1) {
                queue.offer(Node(i,j))
                riped[i][j] = 0
            } else if (arr[i][j] == -1) {
                riped[i][j] = 0
            }
        }
    }

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        for (i in 0..3) {
            val nX = dx[i] + now.x
            val nY = dy[i] + now.y

            if (nX in 0 until n && nY in 0 until m) {
                if (arr[nX][nY] == 0 && riped[nX][nY] == -1) {
                    queue.offer(Node(nX,nY))
                    riped[nX][nY] = riped[now.x][now.y]+1
                }
            }
        }
    }
    var day = 0
    for (i in riped) {
        for (j in i) {
            if (j == -1) {
                day = -1
            }
            if (day != -1 && j > day) {
                day = j
            }
        }
    }
    bw.write("$day")
    bw.flush()
    bw.close()
}

private data class Node(val x:Int, val y:Int)*/
