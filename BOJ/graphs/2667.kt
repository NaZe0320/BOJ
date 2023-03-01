package graphs

private val dx = arrayOf(1,0,-1,0)
private val dy = arrayOf(0,-1,0,1)
private var n = 0
private lateinit var arr: Array<Array<Int>>
private lateinit var visited: Array<Array<Int>>
fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    n = br.readLine().toInt()
    arr = Array(n){Array (n){0}}
    visited = Array(n) { Array(n) {0} }
    repeat(n) {
        br.readLine().forEachIndexed { index, c ->
            arr[it][index] = c.code - 48
        }
    }
    var num = 1

    for(i in 0 until n) {
        for (j in 0 until n) {
            if (arr[i][j] == 1 && visited[i][j] == 0) {
                DFS(i,j,num)
                num++
            }
        }
    }
    val cnt = Array<Int>(num-1) {0}
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (visited[i][j] != 0) {
                cnt[visited[i][j]-1]++
            }
        }
    }
    bw.write("${num-1}\n")
    for (i in cnt.sorted()) {
        bw.write("$i\n")
    }
    bw.flush()
    bw.close()
}

private fun DFS(x: Int, y: Int, num: Int ) {
    visited[x][y] = num
    for (i in 0 .. 3) {
        val nX = dx[i] + x
        val nY = dy[i] + y

        if (nX in 0 until n && nY in 0 until n) {
            if (arr[nX][nY] == 1 && visited[nX][nY] == 0) {
                DFS(nX, nY, num)
            }
        }
    }
}