package level_15

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val x = br.readLine().toInt()
    val a = br.readLine().split(" ").map { it.toInt() }

    val arr = a.sorted()
    if (x%2==0){
        bw.write("${arr[0] * arr[x-1]}")
    } else {
        bw.write("${arr[x/2] * arr[x/2]}")
    }
    bw.flush()
    bw.close()
}