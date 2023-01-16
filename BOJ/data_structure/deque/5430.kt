package problem

fun main() {
    val br = System.`in`.bufferedReader()
    val t = br.readLine().toInt()

    repeat(t) {
        val p = br.readLine()
        val n = br.readLine().toInt()
        val arr = br.readLine().split("[", ",","]").map { (it.ifEmpty { 0 }).toString().toInt()}

        val dq = ArrayDeque<Int>()

        var error = false
        var direct = true
        for (i in arr)
            if (i!=0) dq.add(i)

        for (i in p)
            when (i) {
                'R' -> direct = !direct
                'D' -> if (dq.isNotEmpty()) { if (direct) dq.removeFirst() else dq.removeLast() } else error = true
            }
        if (error) {
            println("error")
        } else {
            if (direct) println("["+dq.joinToString(",")+"]")
            else println("["+dq.reversed().joinToString(",")+"]")
        }
    }
}