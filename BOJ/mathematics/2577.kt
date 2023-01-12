package mathematics

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val arr = Array<Int>(10) {0}
    var num = 1

    repeat(3) {
        num *= br.readLine().toInt()
    }

    for (i in num.toString()) {
        arr[i.toInt()-48] ++
    }

    for (i in arr) {
        bw.write("$i\n")
    }
    bw.flush()
    bw.close()
}