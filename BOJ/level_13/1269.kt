package level_13

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (n, m) = br.readLine().split(" ").map { it.toInt() }

    val a = HashSet<Int>()
    val b = HashSet<Int>()

    var count = 0

    br.readLine().split(" ", limit = n).map {
        a.add(it.toInt())
    }
    br.readLine().split(" ", limit = m).map {
        if (a.contains(it.toInt())) {
            count ++
        }
    }
    bw.write("${n+m-(count*2)}")
    bw.flush()
    bw.close()
}