package class3

private lateinit var area:Array<Array<Int>>
private lateinit var n: List<Int>
private var cnt = 0
fun main() {

    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    repeat( br.readLine().toInt()) {
        n = br.readLine().split(" ").map { it.toInt() }
        area = Array(n[0]) { Array(n[1]) {0} }

        repeat(n[2]) {
            val (x,y) = br.readLine().split(" ").map { it.toInt() }
            area[x][y] = 1
        }
        for (i in 0 until n[0]) {
            for (j in 0 until n[1]) {
                if (area[i][j] == 1) {
                    checkNext(i,j)
                    cnt++
                }
            }
        }
        bw.write("$cnt \n")
        cnt = 0
        bw.flush()
    }
}

fun checkNext(i: Int, j: Int) {
    if (area[i][j] == 1) {
        area[i][j] = 0
        if (i > 0) {
            checkNext(i-1,j)
        }
        if (j > 0) {
            checkNext(i,j-1)
        }
        if (i < n[0]-1) {
            checkNext(i+1,j)
        }
        if (j < n[1]-1) {
            checkNext(i,j+1)
        }
    }
}