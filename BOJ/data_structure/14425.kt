package level_13

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val hashSet = HashSet<String>()

    repeat(n) {
        hashSet.add(br.readLine())
    }

    var cnt = 0
    repeat(m) {
        if (hashSet.contains(br.readLine())) cnt++
    }

    bw.write("$cnt")
    bw.flush()
    bw.close()
}