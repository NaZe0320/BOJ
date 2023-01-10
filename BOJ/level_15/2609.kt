package level_15

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (n, m) = br.readLine().split(" ").map { it.toInt() }

    bw.write("${gcd(n,m)}\n")
    bw.write("${n*m/gcd(n,m)}")
    bw.flush()
    bw.close()
}

private fun gcd(n: Int, m: Int) : Int = if (m!=0) gcd(m, n%m) else n