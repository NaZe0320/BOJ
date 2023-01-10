package level_14

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val x = br.readLine().toInt()
    val s = Array(6) { List(2) { 0 } }
    val len = Array(4) {0}
    val cnt = Array(4) {0}

    repeat(6) { i ->
        s[i] = br.readLine().split(" ").map { it.toInt() }
        cnt[s[i][0]-1] ++
    }
    var a = 0
    var b = 0

    for (i in cnt.indices) {
        if (cnt[i] == 1) {
            if (i == 0 || i == 1) { //가로
                a = i+1
                for (j in s){
                    if (j[0] == i+1)
                        len[0] = j[1]
                }
            } else { //세로
                b = i+1
                for (j in s){
                    if (j[0] == i+1)
                        len[1] = j[1]
                }
            }
        }
    }

    for (i in s.indices) {
        if (s[i][0] == 3-a) { //가로 중 2번 나온 방향

            if (i >= 5) {
                if (s[i-1][0]!=b && s[0][0]!=b) {
                    len[2] = s[i][1]
                }
            } else if (i <= 0){
                if (s[5][0]!=b && s[1][0]!=b) {
                    len[2] = s[i][1]
                }
            } else {
                if (s[i-1][0]!=b && s[i+1][0]!=b) {
                    len[2] = s[i][1]
                }
            }
        } else if (s[i][0] == 7-b) { //세로 중 2번 나온 방향
            if (i >= 5) {
                if (s[i-1][0]!=a && s[0][0]!=a) {
                    len[3] = s[i][1]
                }
            } else if (i <= 0){
                if (s[5][0]!=a && s[1][0]!=a) {
                    len[3] = s[i][1]
                }
            } else {
                if (s[i-1][0]!=a && s[i+1][0]!=a) {
                    len[3] = s[i][1]
                }
            }
        }
    }

    val area = len[0] * len[1] - len[2] * len[3]
    bw.write("${area*x}")
    bw.newLine()
    bw.flush()
    bw.close()
}
