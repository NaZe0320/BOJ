package recursion

private lateinit var paper: Array<List<Int>>
private val cnt = intArrayOf(0,0,0)
fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()

    paper = Array(n) { List(n) {0} }

    repeat(n) { i ->
        paper[i] = (br.readLine().split(" ").map { it.toInt() })
    }
    checkPaper(0,0,n,n)
    for (i in cnt) {
        println(i)
    }
}
private fun checkPaper(n1: Int, m1: Int, n2: Int, m2: Int) {
    var check = true
    val a = paper[n1][m1]
    val x = n2 - n1
    if (x != 1) {
        for (i in n1 until n2) {
            for (j in m1 until m2) {
                if (paper[i][j] != a) {
                    check = false
                    break
                }
            }
            if (!check) break
        }
        if (check) {
            cnt[a+1]++
        } else {
            for (i in n1 until n1+x step x/3) {
                for (j in m1 until m1+x step x/3) {
                    checkPaper(i, j, i+x/3, j+x/3)
                }
            }
        }
    } else {
        cnt[a+1] ++
    }
}