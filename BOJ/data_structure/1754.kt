package level_13

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val hashSet = HashSet<String>()
    val array = ArrayList<String>()
    repeat(n) {
        hashSet.add(br.readLine())
    }
    var cnt = 0
    repeat(m) {
        val x = br.readLine()
        if (hashSet.contains(x)) {
            cnt++
            array.add(x)
        }
    }
    array.sort()
    bw.write("$cnt\n")
    for (i in array) {
        bw.write("$i\n")
    }
    bw.flush()
    bw.close()
}