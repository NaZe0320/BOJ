package mathematics

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val (n,k) = br.readLine().split(" ").map { it.toInt() }
    var array = Array(n+1) { Array<Int>(n+1){0} }

    for (i in 1..n) {
        for (j in 0..i) {
            if (i==j || j==0) {
                array[i][j] = 1
            } else {
                array[i][j] = (array[i-1][j-1] + array[i-1][j]) % 10007
            }
        }
    }
    bw.write("${array[n][k]}")

    bw.flush()
    bw.close()
}