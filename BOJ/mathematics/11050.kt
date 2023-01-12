package mathematics

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (n,k) = br.readLine().split(" ").map { it.toInt() }
    var answer = 1
    if (n/2 > k) {
        for (i in n-k+1..n) {
            answer *= i
        }
        for (i in 1..k) {
            answer /= i
        }
    } else {
        for (i in k+1..n) {
            answer *= i
        }
        for (i in 1..n-k) {
            answer /= i
        }
    }
    bw.write("$answer")
    bw.flush()
    bw.close()
}