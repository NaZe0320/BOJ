package level_11

private var count = 0
private val startList= ArrayList<Int>()
private val endList= ArrayList<Int>()
fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val x = br.readLine().toInt()

    hanoi(x,1,3)
    bw.write("$count\n")
    for (i in startList.indices) {
        bw.write("${startList[i]} ${endList[i]}\n")
    }

    bw.flush()
    bw.close()
}

fun hanoi(n: Int, start: Int, end: Int) {
    val mid = 6 -start- end
    if (n==1) {
        count ++
        startList.add(start)
        endList.add(end)
    } else {
        count++
        hanoi(n-1,start,mid)
        startList.add(start)
        endList.add(end)
        hanoi(n-1,mid,end)
    }
}