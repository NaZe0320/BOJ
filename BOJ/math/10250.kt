package level_07

fun main() {
    val n = readln().toInt()

    for(i in 0 until n) {
        val x = readln().split(" ")
        val h = x[0].toInt()
        val w = x[1].toInt()
        val k = x[2].toInt()

        if (k%h == 0) {
            println(String.format("%d%02d",h,k/h))
        } else {
            println(String.format("%d%02d",k%h,k/h+1))
        }
    }
}