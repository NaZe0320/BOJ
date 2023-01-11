package level_13

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val (n, m) = br.readLine().split(" ").map { it.toInt() }

    val hashMap = HashMap<String, String>()
    val hashMap2 = HashMap<String, String>()
    repeat(n) {
        val x = br.readLine()
        hashMap[(it+1).toString()] = x
        hashMap2[x] = (it+1).toString()
    }

    repeat(m) {
        val x = br.readLine()
        if (x[0] in '0'..'9') {
            bw.write("${hashMap[x]}\n")
        } else {
            bw.write("${hashMap2[x]}\n")
        }
    }

    bw.flush()
    bw.close()
}