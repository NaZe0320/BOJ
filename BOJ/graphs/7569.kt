/*
package graphs

import java.util.LinkedList
import java.util.Queue
import java.util.StringTokenizer

private val dx = arrayOf(1,0,-1,0,0,0)
private val dy = arrayOf(0,-1,0,1,0,0)
private val dz = arrayOf(0,0,0,0,1,-1)

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (m,n,h) = br.readLine().split(" ").map { it.toInt() }

    val arr = Array(h) { Array(n) { Array(m) {-1} } }
    val riped = Array(h) { Array(n) { Array(m) {-1} } }
    val queue: Queue<Node> = LinkedList()

    repeat(h) { i ->
        repeat(n) { j ->
            val st = StringTokenizer(br.readLine())
            repeat(m) { l ->
                val tomato = st.nextToken().toInt()
                arr[i][j][l] = tomato

                when (tomato) {
                    1 -> {
                        queue.offer(Node(i,j,l))
                        riped[i][j][l] = 0
                    }
                    -1 -> riped[i][j][l] = 0
                }
            }
        }
    }
    while (queue.isNotEmpty()) {
        val now = queue.poll()

        for (i in 0..5) {
            val nX = dx[i] + now.x
            val nY = dy[i] + now.y
            val nZ = dz[i] + now.z

            if (nX in 0 until h && nY in 0 until n && nZ in 0 until m) {
                if (arr[nX][nY][nZ] == 0 && riped[nX][nY][nZ] == -1) {
                    queue.offer(Node(nX,nY,nZ))
                    riped[nX][nY][nZ] = riped[now.x][now.y][now.z] + 1
                }
            }
        }
    }
    var day = 0

    for (i in riped) {
        for (j in i) {
            for (l in j) {
                if (l == -1) {
                    day = -1
                }
                if (day != -1 && l > day) {
                    day = l
                }
            }
        }
    }
    bw.write("$day")
    bw.flush()
    bw.close()

}

private data class Node(val x: Int, val y:Int, val z:Int)*/
