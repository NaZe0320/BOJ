package level_37

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val t = br.readLine()
    val p = br.readLine()

    val pi = Array(p.length) {0}
    val list = ArrayList<Int>()
    var cnt = 0

    var j = 0
    for (i in 1 until p.length) {
        while (j > 0 && p[i] != p[j]) {
            j = pi[j-1]
        }
        if (p[i] == p[j]) {
            pi[i] = ++j
        }
    }

    j = 0
    for (i in t.indices) {
        while ( j > 0 && t[i] != p[j]) {
            j = pi[j-1]
        }
        if (t[i] == p[j]) {
            if (j == p.length - 1) {
                cnt++
                list.add(i-j+1)
                j = pi[j]
            } else {
                j++
            }
        }
    }
    bw.write("$cnt\n")
    for (i in list) {
        bw.write("$i ")
    }
    bw.flush()
}
