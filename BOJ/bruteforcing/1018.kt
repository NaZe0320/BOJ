package level_12

val board = Array<Array<String>>(51) {Array<String>(51) {""}}
fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val x = br.readLine().split(" ").map { it.toInt() }

    repeat(x[0]) { i ->
        br.readLine().mapIndexed { index, c -> board[i][index] = c.toString() }
    }

    var min = 32
    for (i in 0..x[0]-8) {
        for (j in 0..x[1]-8) {
            val countBW = checkBW(i,j)
            val countWB = checkWB(i,j)
            bw.write("체크")

            if (min>countBW)
                min = countBW
            if (min>countWB)
                min = countWB
        }
    }
    println(min)
}

fun checkWB(n: Int, m: Int): Int {
    var count = 0
    val pattern2 = arrayOf("B", "W", "B", "W", "B", "W", "B", "W")
    val pattern1 = arrayOf("W", "B", "W", "B", "W", "B", "W", "B")

    repeat(8) { i ->
        if (i%2==0) {
            repeat(8 ) { j ->
                if (pattern1[j] != board[i+n][j+m]) {
                    count++
                }
            }
        } else {
            repeat(8 ) { j ->
                if (pattern2[j] != board[i+n][j+m]) {
                    count++
                }
            }
        }
    }

    return count
}

fun checkBW(n: Int, m: Int): Int {
    var count = 0
    val pattern1 = arrayOf("B", "W", "B", "W", "B", "W", "B", "W")
    val pattern2 = arrayOf("W", "B", "W", "B", "W", "B", "W", "B")

    repeat(8) { i ->
        if (i%2==0) {
            repeat(8 ) { j ->
                if (pattern1[j] != board[i+n][j+m]) {
                    count++
                }
            }
        } else {
            repeat(8 ) { j ->
                if (pattern2[j] != board[i+n][j+m]) {
                    count++
                }
            }
        }
    }

    return count
}