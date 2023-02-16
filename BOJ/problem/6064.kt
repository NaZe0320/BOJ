package problem

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val num = br.readLine().toInt()

    repeat(num) {
        val (m,n,x,y) = br.readLine().split(" ").map { it.toInt() }
        val max = m*n/gcd(m,n)

        var ans = x
        while (ans <= max) {
            if (y == if (ans % n == 0) n else ans%n) {
                break
            }
            ans += m
        }
        bw.write("${if (ans <= max) ans else -1}")
        bw.newLine()
    }
    bw.flush()
    bw.close()
}
fun gcd(m: Int, n: Int): Int = if (n!=0) gcd(n,m%n) else m