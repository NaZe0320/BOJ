package level_11

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    var x = br.readLine().toInt()

    var num = 665

    while (x!=0) {
        num++
        var count = 0
        var tmp = num
        while(tmp>0) {
            if (tmp%10 == 6) {
                count++
            } else {
                count =0
            }
            tmp/=10
            if (count == 3) {
                x--
            }
        }
    }
    println(num)
}