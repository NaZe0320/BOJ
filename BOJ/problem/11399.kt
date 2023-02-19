package problem

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    var n = br.readLine().toInt()
    val arr = br.readLine().split(" ").map { it.toInt() }

    var sum = 0

    for (i in arr.sorted()){
        sum += i * (n--)
    }
    bw.write("$sum")
    bw.flush()
    bw.close()
}