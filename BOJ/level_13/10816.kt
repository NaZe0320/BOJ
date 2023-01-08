package level_13

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val x1 = br.readLine().toInt()
    val hashMap = HashMap<Int, Int>()
    br.readLine().split(" ").map {
        val n = it.toInt()
        if (hashMap[n] == null) {
            hashMap[n] = 1
        } else {
            hashMap.replace(n, hashMap[n]!!.toInt()+1)
        }
    }
    val x2 = br.readLine().toInt()
    br.readLine().split(" ").map {
        val n = it.toInt()
        bw.write("${if (hashMap[n] != null) hashMap[n] else 0} ")
    }
    bw.flush()
    bw.close()
}