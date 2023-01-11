package implemetation

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val x = br.readLine().split(" ").map { it.toInt() }
    val ascending = listOf<Int>(1,2,3,4,5,6,7,8)
    val descending = listOf<Int>(8,7,6,5,4,3,2,1)
    when (x) {
        ascending -> bw.write("ascending")
        descending -> bw.write("descending")
        else -> bw.write("mixed")
    }
    bw.flush()
    bw.close()
}
