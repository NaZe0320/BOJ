package implementation

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    do {
        val n = br.readLine()
        var pali = "yes"
        if (n=="0") {
            break
        } else {
            if (n.length%2==0) {
                for (i in 0 until n.length/2) {
                    if (n[i] != n[n.length-i-1]) {
                        pali = "no"
                        break
                    }
                }
            } else {
                for (i in 0..n.length/2) {
                    if (n[i] != n[n.length-i-1]) {
                        pali = "no"
                        break
                    }
                }
            }
        }
        println(pali)
    } while(true)
}