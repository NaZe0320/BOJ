package graphs

private lateinit var arr: Array<Array<Int>>
private lateinit var visited: Array<Boolean>
private var cnt = 0

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()

    arr = Array(n+1) {Array(n+1) {0}}
    visited = Array(n+1) {false }

    repeat(br.readLine().toInt()) {
        val (x,y) = br.readLine().split(" ").map { it.toInt() }
        arr[x][y] = 1
        arr[y][x] = 1
    }

    dfs(1,n)
    bw.write("${cnt-1}")
    bw.flush()
    bw.close()
}

private fun dfs(x: Int, n: Int) {
    visited[x] = true
    cnt++
    for (i in 1 .. n) {
        if (arr[x][i]==1 && !visited[i]) {
            dfs(i,n)
        }
    }
}