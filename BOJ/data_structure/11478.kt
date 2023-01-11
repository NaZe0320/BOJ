package level_13

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val x = br.readLine()

    val hashSet = HashSet<String>()

    for ( i in 1..x.length) {
        for (j in 0..x.length-i) {
            hashSet.add(x.substring(j,j+i))
        }
    }
    bw.write("${hashSet.size}")
    bw.flush()
}