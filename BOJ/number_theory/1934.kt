package level_15

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    repeat(br.readLine().toInt()) {
        val (n, m) = br.readLine().split(" ").map { it.toInt() }

        bw.write("${n*m/gcd(n,m)}\n")
    }

    bw.flush()
    bw.close()
}

private fun gcd(n: Int, m: Int) : Int = if (m!=0) gcd(m, n%m) else n