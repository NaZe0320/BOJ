package problem

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val (n,m) = br.readLine().split(" ").map { it.toInt() }
    val price = ArrayList<Int>()
    repeat(n) {
        price.add(br.readLine().toInt())
    }
    var money = m
    var cnt = 0
    for (i in price.size-1 downTo 0) {
        if (money/price[i] >= 1) {
            cnt += money/price[i]
            money %= price[i]
        }
        if (money == 0) {
            break
        }
    }
    bw.write("$cnt")
    bw.flush()
    bw.close()
}