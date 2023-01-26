package recursion

private lateinit var quad: Array<CharArray>
private val bw = System.out.bufferedWriter()
fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    quad = Array(n) { CharArray(n) {'0'} }
    repeat(n) { i ->
        quad[i] = br.readLine().toCharArray()
    }
    checkDot(0,0,n)
    bw.flush()
    bw.close()
}

private fun checkDot(n: Int, m: Int, size:Int) {
    if (checkPossibility(n,m,size)) {
        bw.write(quad[n][m].toString())
    } else {
        bw.write("(")
        checkDot(n, m, size/2)
        checkDot(n, m+size/2, size/2)
        checkDot(n+size/2, m, size/2)
        checkDot(n+size/2, m+size/2, size/2)
        bw.write(")")
    }
}

private fun checkPossibility(n:Int, m:Int, size:Int): Boolean {
    val a = quad[n][m]

    for (i in n until n+size) {
        for (j in m until m+size) {
            if (a != quad[i][j]) return false
        }
    }
    return true
}